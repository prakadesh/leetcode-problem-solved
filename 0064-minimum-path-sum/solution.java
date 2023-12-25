class Solution {

    int helper(int grid[][] , int i ,int j ,int [][] dp){
        //memoization
        if(i == 0 && j == 0) return grid[0][0];
        
        if(dp[i][j] != -1) return dp[i][j] ; 
        int upMin = (i-1) >= 0 ? helper(grid , i-1 , j , dp) : Integer.MAX_VALUE;
        int leftMin = (j-1) >= 0 ? helper(grid , i ,j-1 ,dp) : Integer.MAX_VALUE;
        
        dp[i][j] = grid[i][j] + Math.min(upMin , leftMin) ;
        return  dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int  n = grid.length;
        int  m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int[] I : dp) Arrays.fill(I , -1);
        
        //tabulation
        dp[0][0]=grid[0][0];

        for(int i=1;i<m;i++) dp[0][i]=dp[0][i-1]+grid[0][i] ;
        for(int i=1;i<n;i++) dp[i][0]=dp[i-1][0]+grid[i][0] ; 

        for(int i=1; i<n;i++){
            
             for(int j=1;j<m;j++){
                int  upMin = (i-1) >= 0 ? dp[i-1][j] : Integer.MAX_VALUE;
                 int leftMin = (j-1) >= 0 ? dp[i][j-1] : Integer.MAX_VALUE;
                 dp[i][j] = grid[i][j] + Math.min(upMin , leftMin) ;
             }

             
        }
        return dp[n-1][m-1] ;
    }
}
