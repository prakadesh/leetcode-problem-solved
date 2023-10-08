class Solution {
    public int addDigits(int num) {
        int sum=0,digit=0;
        if(num<9) return num;
        while(num>9){
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num/=10;

        }
           num=sum;
           sum=0;
        }
        return num;

        
    }
}
