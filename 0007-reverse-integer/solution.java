class Solution {
    public int reverse(int x) 
    {
        long rev=0;
        if(x<0)
        {
            x=x*-1;
            while(x>0)
            {
                rev=(rev*10)+(x%10);
                x=x/10;
            }
            rev=-1*rev;
            if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE)
            {
                return (int)rev;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            while(x>0)
            {
                rev=(rev*10)+(x%10);
                x=x/10;
            }
            rev=1*rev;
            if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE)
            {
                return (int)rev;
            }
            else
            {
                return 0;
            }
        }
    }
}
