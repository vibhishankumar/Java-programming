class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max_so_far=arr[0];
        long max_ending_here=0;
        for(int i=0;i<n;i++)
        {
            max_ending_here+=arr[i];
            max_so_far=Math.max(max_so_far,max_ending_here);
            if(max_ending_here<0)
            {
                max_ending_here=0;
            }
            // if(max_so_far<max_ending_here)
            // {
            //     max_so_far=max_ending_here;
            // }
            // else if(max_ending_here<0)
            // {
            //     max_ending_here=0;
            // }
        }
        return max_so_far;
        
    }
    
}

// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.
