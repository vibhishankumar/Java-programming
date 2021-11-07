class Solution {
    public String multiply(String num1, String num2) {
        int n=num2.length();
        int m=num1.length();
        if(n==0||m==0||"0".equals(num1)||"0".equals(num2))
        {
            return "0";
        }
        if("1".equals(num1))
        {
            return num2;
        }
        if("1".equals(num2))
        {
            return num1;
        }
        int[] res=new int[n+m];//maximum length of two product res
        //123*456 == length 6
        for(int i=m-1;i>=0;i--)
        {
          for(int j=n-1;j>=0;j--)
          {
              int prod=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                  prod+=res[i+j+1];
              res[i+j+1]=prod%10;
              res[i+j]+=prod/10;
          }
        }
        StringBuilder sb=new StringBuilder();
        for(int r:res)
        {
            if(sb.length()==0&&r==0)
            {
                continue;
            }
            sb.append(r);
        }
        return sb.toString();
        
    }
}
// input num1="123,num2="456"
//   output="56088"
