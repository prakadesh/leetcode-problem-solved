class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n ==0) return 1;
        int result = 9;
        for (int i = 1;i<n;i++){
            result *=10-i;
        }
        return result + countNumbersWithUniqueDigits(n-1);
      
    
    }
}
