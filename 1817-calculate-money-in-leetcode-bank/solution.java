class Solution {
    public int totalMoney(int n) {

        int totweeks  = n/7 ;

        int firstweeks = (1+2+3+4+5+6+7);

        int lastweeks = firstweeks + (totweeks - 1) * 7;

        int totalsum = (firstweeks + lastweeks) * totweeks / 2;

        int remdays = n % 7;
        int additionalsum  = 0;
        int k = totweeks + 1; 
        for( int i = 1; i <= remdays ;i++ ){
            additionalsum += k; 
            k++;
        }
        int result  =  totalsum + additionalsum;
        return result;
    }
    
}
