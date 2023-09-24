class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int a[]=new int[n+1];
        a[n]=1;
        a[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            a[i]=a[i+1]+a[i+2];

        }
        return a[0];
        
    }
}
