class Solution {
    public int beautifulSubstrings(String s, int k) {
    
        int n = s.length();
        int bstring = 0;

        for (int i = 0; i < n; i++) {
            int vcount = 0;
            int ccount = 0;

            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                    vcount++;
                } else {
                    ccount++;
                }

                if (ccount == vcount && (vcount * ccount) % k == 0) {
                    bstring++;
                }
            }
        }
        return bstring;

        
    }
}
