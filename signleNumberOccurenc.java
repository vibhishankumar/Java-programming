class Solution {
    public int[] singleNumber(int[] nums) {
//         int[] ans = new int[2];
        
//         ans[0] = nums[0];
//         ans[1] = nums[1];
//         int index = 0;
//         for(int i=2;i<nums.length;i++){
//             if(nums[i]==ans[0] || nums[i]==ans[1]){
//                 if(nums[i]==ans[0]){
//                     index = 0;
//                 }else{
//                     index = 1;
//                 }
//                 continue;
//             }else{
//                 ans[index] = nums[i];
//             }
//         }
        
//        return ans; 
        
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i=0;i<nums.length;i++)
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         int[] ans = new int[2];
//         int index = 0;
//         for(int key : map.keySet()){
//             if(map.get(key)>1){
//                 continue;
//             }else{
//                 ans[index++] = key;
//             }
//         }
//         return ans;
      //sol 3
        int[] res=new int[2];
        int bit=nums[0];//it will store xor of 3 and 5 ==6
        for(int i=1;i<nums.length;i++)
        {
            bit=bit^nums[i];
        }
        int lowestBit=Integer.lowestOneBit(bit);
        for(int i=0;i<nums.length;i++)
        {
            if((lowestBit&nums[i])==0)
            {
                res[1]=res[1]^nums[i];
            }
            else
            {
                res[0]=res[0]^nums[i];
            }
        }
        return res;
    }
}
// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer
