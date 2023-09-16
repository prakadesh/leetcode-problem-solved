class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int firstlen = haystack.length();
        int secondlen = needle.length();

        for (int i = 0; i <= firstlen - secondlen; i++) {
            int j; // Declare j here
            for (j = 0; j < secondlen; j++) { // Corrected loop condition
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == secondlen) {
                return i;
            }
        }
        return -1;
    }
}

