class Solution {
    //dfs to check boundary having O
    //making 0-surrounded to '1'
    public void dfs(char[][] board,int i,int j)
    {
        if(i<0||i>board.length-1||j<0||j>board[0].length-1)return ;
        if(board[i][j]=='O')board[i][j]='1';
        if(i>0&&board[i-1][j]=='O')
        {
            dfs(board,i-1,j);
        }
        if(i<board.length-1&&board[i+1][j]=='O')
        {
            dfs(board,i+1,j);
        }
        if(j>0&&board[i][j-1]=='O')
        {
            dfs(board,i,j-1);
        }
        if(j<board[0].length-1&&board[i][j+1]=='O')
        {
            dfs(board,i,j+1);
        }
    }
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        if(r==0||c==0)
        {
            return ;
        }
        for(int i=0;i<r;i++)
        {
            if(board[i][0]=='O')dfs(board,i,0);
            if(board[i][c-1]=='O')dfs(board,i,c-1);
        }
        for(int j=0;j<c;j++)
        {
            if(board[0][j]=='O')dfs(board,0,j);
            if(board[r-1][j]=='O')dfs(board,r-1,j);
        }
        //now we only need to find 'O' and convert to 'X'
        // else if it 1 then again in given format as 'O'
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='1')
                {
                    board[i][j]='O';
                }
            }
        }
       
    }
}
// i/p  [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
// i/p  [["O","O","O"],["O","O","O"],["O","O","O"]]
