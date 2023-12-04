class Solution {
    public int maxVowels(String s, int k) {
        
        int mcount = 0;

        for(int i = 0; i < k; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                mcount++;
            }
        }
        int n = s.length();
        int count = mcount;
         for(int i=k; i < n; i++){
             if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                count++;
            }
            if(s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e'|| s.charAt(i-k) == 'i'|| s.charAt(i-k) == 'o'|| s.charAt(i-k) == 'u'){
                count--;
            }
          mcount = Math.max (count , mcount);
         }
         return mcount;
         
    }
   
}
