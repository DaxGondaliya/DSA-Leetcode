public class 59. Spiral Matrix II {
    
}
class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int stcol = 0 , endcol = n-1;
        int strow = 0 , endrow = n-1;
        int num = 1;
        while(stcol<=endcol && strow<=endrow){
            //top
            for(int i=stcol ; i<=endcol ; i++){
                mat[strow][i] = num;
                num++;
            }

            //right
            for(int i=strow+1 ; i<=endrow ; i++){
                mat[i][endcol] = num;
                num++;
            }

            //bottom
            for(int i=endcol-1 ; i>=stcol ; i--){
                mat[endrow][i] = num;
                num++;
            }

            //left
            for(int i=endrow-1 ; i>=strow+1 ; i--){
                mat[i][stcol] = num;
                num++;
            }
            
            stcol++;
            strow++;
            endcol--;
            endrow--;
        }
        return mat;
    }
}