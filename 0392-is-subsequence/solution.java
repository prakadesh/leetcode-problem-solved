class Solution {
    public boolean isSubsequence(String s, String t) {
       int IndexS = 0;
        int IndexT = 0;

        while(IndexS < s.length() && IndexT < t.length()){
            if(s.charAt(IndexS) == t.charAt(IndexT)){
                IndexS++;
                IndexT++;
            }else{
                IndexT++;
            }
        }

        return IndexS == s.length();
    }
}
