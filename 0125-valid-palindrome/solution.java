class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newStr += s.charAt(i);
            }

        }
        newStr = newStr.toLowerCase();
        for(int i =0;i<newStr.length()/2;i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
