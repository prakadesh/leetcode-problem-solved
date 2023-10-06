class Solution {
    int[] dp;
    public int integerBreak(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return sol(n);

    }
    public int sol(int n){
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int maxx=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            maxx=Math.max(maxx,Math.max(i*sol(n-i),i*(n-i)));
        }
        dp[n]=maxx;
        return dp[n];
    }
}
