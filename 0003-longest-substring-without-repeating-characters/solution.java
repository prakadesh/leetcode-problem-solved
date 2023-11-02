class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int subStrLength = 0;
        int left=0;
        int right=0;
        HashSet<Character> charSet = new HashSet<>();
        while(right<n){
            if(!charSet.contains(s.charAt(right))){
            charSet.add(s.charAt(right));
            subStrLength = Math.max(subStrLength, right-left+1);
            right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return subStrLength;
    }
}
