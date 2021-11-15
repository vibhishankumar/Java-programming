class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp=new int[nums.length];
        return constructLds(nums,dp,getLDSize(nums,dp));
        
    }
    private int getLDSize(int[] nums,int[] dp)
    {
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        int ldSize=1;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0)
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    ldSize=Math.max(ldSize,dp[i]);
                }
            }
        }
        return ldSize;
    }
    private List<Integer> constructLds(int[] nums,int[] dp,int ldSize)
    {
        int prev=-1;
        LinkedList<Integer> lds=new LinkedList<>();
        for(int i=dp.length-1;i>=0;i--)
        {
            if(dp[i]==ldSize&&(prev==-1||prev%nums[i]==0))
            {
                lds.addFirst(nums[i]);
                ldSize--;
                prev=nums[i];
            }
        }
        return lds;
    }
}
// Input: nums = [1,2,3]
// Output: [1,2]
// Explanation: [1,3] is also accepted.
