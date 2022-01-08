/*package whatever //do not write package name here */

import java.io.*;

class Merge{
    public static void sort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            mergeUtil(arr,l,m,r);
        }
    }
    public static void mergeUtil(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] larr=new int[n1];
        int[] rarr=new int[n2];
        for(int i=0;i<n1;i++)
        {
            larr[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++)
        {
            rarr[i]=arr[i+m+1];
        }
        //initialize  for result ArrayStore
        int k=l;
        int i=0,j=0;
        while(i<n1&&j<n2)
        {
            if(larr[i]<=rarr[j])
            {
                arr[k]=larr[i];
                i++;
            }else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        //go for remaing in larr and rarr
        while(i<n1)
        {
            arr[k]=larr[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=rarr[j];
            k++;
            j++;
        }
    }
	public static void main (String[] args) {
	    int[] arr={3,2,5,1,6};
	    sort(arr,0,arr.length-1);
	    for(int a:arr)
		{System.out.print(a+" ");}
	}
}
//Time complexity of Merge Sort is  θ(nLogn) in all 3 cases (worst, average and best) 
// as merge sort always divides the array into two halves and takes linear time to merge two halves.
