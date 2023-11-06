class Solution {
    public int myAtoi(String s) {
        long res = 0;
        int sign = 1;
        int ci=0;

        while(ci<s.length() && s.charAt(ci)==' '){
            ci++;
        }
        if(ci<s.length() && s.charAt(ci)=='-'){
            sign=-1;
            ci++;
        }else if(ci<s.length() && s.charAt(ci)=='+'){
            ci++;
        }
        while(ci < s.length() && isDigit(s.charAt(ci))){
            res = (res*10 + Integer.valueOf(s.charAt(ci)-'0')); 
            ci++;
            if(res*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if (res*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        res*=sign;

        return (int)res;
    }

    private boolean isDigit(char c){
        return c>='0' && c<='9';
    }
}
