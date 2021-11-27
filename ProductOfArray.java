class Solution {
    //tc of program is o(n)
    public int[] productExceptSelf(int[] nums) {
       
        int[] res=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        //leftprefixproduct
        int leftpro=1;
        for(int i=0;i<nums.length;i++)
        {
            leftpro*=nums[i];
            left[i]=leftpro;
        }
        //rightPrefixproduct
        int rightpro=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            rightpro*=nums[i];
            right[i]=rightpro;
        }
        for(int i=0;i<nums.length;i++)
        {
            int leftproans=i>=1?left[i-1]:1;//for leftproduct
            int rightproans=i<nums.length-1?right[i+1]:1;//for right product
            res[i]=leftproans*rightproans;//final product
        }
        return res;
        
    }
}

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
