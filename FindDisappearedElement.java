class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        //sol 1 using extra space 
//         Map<Integer,Integer> hold=new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
            
//             if(hold.containsKey(nums[i]))
//             {
//                 hold.put(nums[i],hold.get(nums[i])+1);
//             }
//             else{
//                 hold.put(nums[i],1);
//             }
//         }
//         for(int i=1;i<=nums.length;i++)
//         {
//             if(!hold.containsKey(i))
//             {
//                 res.add(i);
//             }
//         }
        //sol 2 without extra sapce
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]>=0)
            {
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                res.add(i+1);
            }
        }
       
        return res;
    }
}

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

//Example 1:

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
