class Solution {

    List<String> l=new ArrayList<>();
       
    void func(int n, String str, int size, int open){

        if(n<=0){
            //case of 
            if(str.length()!=size*2){
                for(int i=str.length();i<size*2;i++)
                    str+=")";
            }
            l.add(str);
            return;
        }
        if(open>0)
            func(n,str+")",size,open-1);
        func(n-1,str+"(",size,open+1);

    }


    public List<String> generateParenthesis(int n) {
        String ans="";
        func(n-1,"(",n,1);
        return l;
        
    }


}
