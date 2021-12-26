/*package whatever //do not write package name here */

import java.io.*;

class GFG {
   public static int firstIndexofArray(int[] arr,int a,int indx)
    {
         if(indx==arr.length)
         {
             return -1;
         }
         int ide=firstIndexofArray(arr,a,indx+1);
         if(ide==-1)
         {
             if(arr[indx]==a)
             {
                 return indx;
             }else{
                 return -1;
             }
         }
         else{
             return ide;
         }
        
    }
	public static void main (String[] args) {
	    int[] arr={1,3,5,2,6,1,2,5};
		System.out.println("last index of array element "+ firstIndexofArray(arr,1,0));
	}
}
