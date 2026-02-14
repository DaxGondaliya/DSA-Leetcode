class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0 , left = 0;
        int right = m-1 , bottom = n-1;

        while(left<=right && top<=bottom){
            //top
            for(int i=left ; i<=right ; i++){
                ans.add(matrix[top][i]);
            }

            //right
            for(int i=top+1 ; i<=bottom ; i++){
                ans.add(matrix[i][right]);
            }

            //bottom
            if(top<bottom){
                for(int i=right-1 ; i>=left ; i--){
                ans.add(matrix[bottom][i]);
                }
            }

            //left
            if(left<right){
                for(int i=bottom-1 ; i>=top+1 ; i--){
                ans.add(matrix[i][left]);
                }
            }

            left++;
            top++;
            right--;
            bottom--;
        }
        return ans;
    }
}