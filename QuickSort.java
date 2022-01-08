/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static void swap(int[] arr,int l,int h)
    {
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
    }
    public static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
           // pi is partitioning index, arr[p]
        // is now at right place 
            int pi=partition(arr,low,high);
            
            //quick sort befor and after partition
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high)
    {
        //pvot
        int pvot=arr[high];
        int i=(low-1);//index of smaller element
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pvot)
            {
              // If current element is smaller 
        // than the pivot
               // Increment index of 
            // smaller element
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
        
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
		int[] arr={6,2,8,1,7};
		quickSort(arr,0,arr.length-1);
		for(int a:arr)
		{
		   System.out.print(a+" "); 
		}
	}
}
//pseudo code
/* low  --> Starting index,  high  --> Ending index */
quickSort(arr[], low, high)
{
    if (low < high)
    {
        /* pi is partitioning index, arr[pi] is now
           at right place */
        pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
}
/* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
partition (arr[], low, high)
{
    // pivot (Element to be placed at right position)
    pivot = arr[high];  
 
    i = (low - 1)  // Index of smaller element and indicates the 
                   // right position of pivot found so far

    for (j = low; j <= high- 1; j++)
    {
        // If current element is smaller than the pivot
        if (arr[j] < pivot)
        {
            i++;    // increment index of smaller element
            swap arr[i] and arr[j]
        }
    }
    swap arr[i + 1] and arr[high])
    return (i + 1)
}
