class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new LinkedList();
        List<Integer> curr=new ArrayList<>();
        curr.add(0);
        dfs(0,curr,graph,graph.length - 1,res);//dfs to traverse
        return res;
        
    }
    void dfs(int src,List<Integer> curr,int[][] graph,int dest, List<List<Integer>>res)
    {
        if(src==dest)
        {
            res.add(new ArrayList(curr));
            return;
        }
        for(int a:graph[src])
        {
            curr.add(a);
            dfs(a,curr,graph,dest,res);
            curr.remove(curr.size()-1);
        }
    }
}
// Input: graph = [[1,2],[3],[3],[]]
// Output: [[0,1,3],[0,2,3]]
// Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
