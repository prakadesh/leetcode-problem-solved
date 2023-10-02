class Solution {
    public int mySqrt(int x) {
        if(x==1){return 1;}
        long s = 1 , e = (x)/2;

        while(s <= e){

            long mid = s+(e-s)/2;
            long val = mid * mid;

            if(val > x){ e = mid-1;}
            else{s=mid+1;}

             } 
    
        return (int)e;
        
    }
}
