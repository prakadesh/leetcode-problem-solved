class Solution {
    public void duplicateZeros(int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                for(int j=a.length-1; j>i; j--){
                    a[j] = a[j-1];
                }
                i++;
            }
        }
    }
}
