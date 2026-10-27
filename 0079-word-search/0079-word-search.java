class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(solve(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean solve(int i,int j,int idx,char[][] board,String word){
        if(idx==word.length())return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx))return false;
        
        char curr=board[i][j];
        board[i][j]='#';
        boolean found=(solve(i+1,j,idx+1,board,word) || solve(i-1,j,idx+1,board,word) ||
        solve(i,j-1,idx+1,board,word) || solve(i,j+1,idx+1,board,word));
        board[i][j]=curr;
        return found;
    }
}