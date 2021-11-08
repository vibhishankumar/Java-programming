class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    
    public int numTrees(int n) {
        // if(n<=1)
        // {
        //     return 1;
        // }
        // int sum=0;
        // for(int i=1;i<=n;i++)
        // {
        //     sum+=numTrees(i-1)*numTrees(n-i);
        // }
        // return sum;
        //sol 2
        if(n<=1)
        {
            return 1;
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!map.containsKey(i-1))
            {
               map.put(i-1,numTrees(i-1)); 
            }
            if(!map.containsKey(n-1))
            {
                map.put(n-i,numTrees(n-1));
            }
            sum+=map.get(i-1)*map.get(n-i);
        }
        return sum;
    }
}
//i/p 3
// o/p 5
//i/p 2
// o/p 2
