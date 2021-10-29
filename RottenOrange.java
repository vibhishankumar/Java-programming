class Solution {
    //with BFS
  //rotten orange represented as 2
  //fresh with 1 and 0 empty space
  //find minimum time to rotten all orange if possible otherwise return -1
    private class Point{
        int x;
        int y;
        public Point(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n==0||m==0)
        {
            return -1;
        }
        //storing data point in queue
        Queue<Point> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Point(i,j));
                }
            }
        }
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                Point root=q.poll();
                int i=root.x;
                int j=root.y;
                if(i<0||j<0||i>=n||j>=m||grid[i][j]<=0)
                {
                    continue;
                }
                grid[i][j]=-1;
                if(i>=1&&grid[i-1][j]==1)
                {
                    grid[i-1][j]=2;
                    q.offer(new Point(i-1,j));
                }
                if(i<n-1&&grid[i+1][j]==1)
                {
                    grid[i+1][j]=2;
                    q.offer(new Point(i+1,j));
                }
                if(j>=1&&grid[i][j-1]==1)
                {
                    grid[i][j-1]=2;
                    q.offer(new Point(i,j-1));
                }
                if(j<m-1&&grid[i][j+1]==1)
                {
                    grid[i][j+1]=2;
                    q.offer(new Point(i,j+1));
                }
            }
            level++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
      //[0] it will gives 0
      return level>0?level-1:0;
    }
}

// i/p: [[2,1,1],[1,1,0],[0,1,1]]
//  o/p: 4
// i/p [[0,2]]
// o/p 0
