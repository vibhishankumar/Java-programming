class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //using set for duplication issue
         Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);//to maintain low and high using sort
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],
                                                nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);
        
    }
}
//i/p [-1,0,1,2,-1,-4]
//o/p [[-1,-1,2],[-1,0,1]]
