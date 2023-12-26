class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i = 0;
        int l = c.length;
        while (i < l) {
            int p = i;
            int j = i + (k - 1);
            if (j >= l) {
                j = l - 1;
            }

            while (p < j) {
                char temp = c[p];
                c[p] = c[j];
                c[j] = temp;
                p++;
                j--;
            }

            i = i + (2 * k);
        }
        String str = new String(c);
        return str;
    }
}
