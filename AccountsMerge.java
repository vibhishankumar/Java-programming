class Solution {
    private class UniFind{
        private int[] parents;
        private UniFind(int n)
        {
            parents=new int[n];
            for(int i=0;i<n;i++)
            {
                parents[i]=i;
            }
        }
        private int getAbsoulateParent(int i)
        {
            if(parents[i]==i)
            {
                return i;
            }
            parents[i]=getAbsoulateParent(parents[i]);
            return parents[i];
        }
        private void unify(int i,int j)
        {
            int absoulateParentsI=getAbsoulateParent(i);
            int absoulateParentsJ=getAbsoulateParent(j);
            if(absoulateParentsI!=absoulateParentsJ)
            {
                //7->2,21->2 (7,21)
                parents[absoulateParentsJ]=absoulateParentsI;
            }
            
        }
    }
    public int largestComponentSize(int[] nums) {
        int max=0;
        for(int el:nums)
        {
            max=Math.max(el,max);
        }
        UniFind uf=new UniFind(max+1);//collect maximum size component length
        
        for(int i:nums)
        {
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    uf.unify(j,i);
                    uf.unify(i/j,i);
                }
            }
        }
        Map<Integer,Integer> mp=new HashMap<>();
        int maxComp=0;
        for(int el:nums)
        {
            int parent=uf.getAbsoulateParent(el);
            mp.put(parent,mp.getOrDefault(parent,0)+1);
            maxComp=Math.max(maxComp,mp.get(parent));
        }
        return maxComp;
    }
}

// //Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
// Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
// Explanation:
// The first and second John's are the same person as they have the common email "johnsmith@mail.com".
// The third John and Mary are different people as none of their email addresses are used by other accounts.
// We could return these lists in any order, for example the answer [['Mary', 'mary@mail.com'], ['John', 'johnnybravo@mail.com'], 
// ['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.
