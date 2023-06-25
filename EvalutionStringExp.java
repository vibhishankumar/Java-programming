package org.demo.general;

import java.util.Stack;

public class MathExpResult {
    public static void main(String[] args) {
        String exp="12*3+8-3";
        int temp=0;
        Stack<Integer> oprnds=new Stack<>();
        Stack<Character> oprtor=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if (ch=='(')
            {
                oprtor.push(ch);
            }else if (Character.isDigit(ch))
            {
                temp=temp*10+ch-'0';
                oprnds.push(temp);//converting to integer
            } else if (ch==')') {
                while (oprtor.peek()!='(')
                {
                    char op=oprtor.pop();
                    int val2=oprnds.pop();
                    int val1=oprnds.pop();
                    oprnds.push(operation(val1,val2,op));

                }
                oprtor.pop();
                
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                //ch is wanting higher priority solve 1st
                while (oprtor.size()>0&&oprtor.peek()!='('&&precendence(ch)<=precendence(oprtor.peek()))
                {
                    char op=oprtor.pop();
                    int val2=oprnds.pop();
                    int val1=oprnds.pop();
                    oprnds.push(operation(val1,val2,op));
                }
                oprtor.push(ch);
                temp=0;//reset when any op found
            }
        }
        while (oprtor.size()!=0)
        {
            char op=oprtor.pop();
            int val2=oprnds.pop();
            int val1=oprnds.pop();
            oprnds.push(operation(val1,val2,op));

        }
        System.out.println("result "+oprnds.peek());
    }
    public static int precendence(char op)
    {
        if(op=='+')
        {
            return 1;
        } else if (op=='-') {
            return 1;
        } else if (op=='*') {
            return 2;

        }
        else {
            return 2;
        }
    }
    public static int operation(int val1,int val2,char op)
    {
        if(op=='+')
        {
            return val1+val2;
        } else if (op=='-') {
            return val1-val2;
        } else if (op=='*') {
            return val1*val2;

        }
        else {
            return val1/val2;
        }
    }
}
//THis code is related to evalution of string infix expression
//String exp="12*3+8-3";   o/p = 41
