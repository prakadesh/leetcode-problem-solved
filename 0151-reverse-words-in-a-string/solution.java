import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s," ");
        String reversed = "";

        while(st.hasMoreTokens()){
            if(reversed == ""){
                reversed = st.nextToken();
            }
            else{
                reversed = st.nextToken() + " " + reversed;
            }
        }
        System.out.println(reversed.trim());
        return reversed;
    }
}
