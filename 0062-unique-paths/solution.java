class Solution {
    public int uniquePaths(int m, int n) {
        int[] rowCells = new int[n];

       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
               if(i == 0 || j == 0) {
                   rowCells[j] = 1;
               }
               else {

               rowCells[j] = rowCells[j-1] + rowCells[j];
               }
           }
       }

       return rowCells[n-1];
    }
}
