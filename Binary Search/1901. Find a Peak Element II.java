class Solution {
    public int maximum(int mat[][] , int col){
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0 ; i<mat.length ; i++){
            if(max<mat[i][col]){
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length , m=mat[0].length;
        int l=0 , r=m-1;
        while(l<=r){
            int mid = (l+r)/2;
            int row = maximum(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1] : -1;
            int right = mid+1<m ? mat[row][mid+1] : -1;
            if(left<mat[row][mid] && right<mat[row][mid]) return new int[]{row,mid};
            else if(left>mat[row][mid]) r = mid-1;
            else l = mid+1;
        }
        return new int[]{-1,-1};
    }
}