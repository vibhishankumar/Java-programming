class Solution {
    public int uniquePathsIII(int[][] grid) {
        //zc for zero count sx and sy for starting point
        int zc=0,sx=0,sy=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    zc++;
                }
                else if(grid[i][j]==1)
                {
                    sx=i;
                    sy=j;
                }
            }
        }
        return dfs(grid,sx,sy,zc);
    }
    public int dfs(int[][] grid,int x,int y,int zc)
    {
        if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]==-1)
        {
            return 0;
        }
        if(grid[x][y]==2)
        {
            return zc==-1?1:0;
        }
        grid[x][y]=-1;
        zc--;
      //to store total count
        int tpath=dfs(grid,x+1,y,zc)
            +dfs(grid,x-1,y,zc)
            +dfs(grid,x,y-1,zc)
            +dfs(grid,x,y+1,zc);
        grid[x][y]=0;//back track
        zc++;
        return tpath;
    }
}
// Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
// Output: 2
