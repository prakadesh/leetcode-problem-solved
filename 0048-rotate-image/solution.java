class Solution {
    public void rotate(int[][] matrix) {
        int arr[] = new int[matrix.length*matrix[0].length];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[k] = matrix[i][j];
                k++;
            }
        }
        k=0;
        for(int j=matrix[0].length-1;j>=0;j--){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]= arr[k];
                k++;
            }
        }
    }
}
