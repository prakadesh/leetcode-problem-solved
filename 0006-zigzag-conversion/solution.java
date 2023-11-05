class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int n = c.length, k = numRows;
        StringBuffer[] r = new StringBuffer[k];
        for(int  i = 0; i<k; i++) r[i] = new StringBuffer();
        int i = 0;
        while(i<n){
            for(int j = 0; j<k && i<n; j++)r[j].append(c[i++]);
            for(int j = k - 2; j>=1 && i<n; j--)r[j].append(c[i++]);
        }
        for(i=1; i<k; i++) r[0].append(r[i]);
        return r[0].toString();
    }
    
}
