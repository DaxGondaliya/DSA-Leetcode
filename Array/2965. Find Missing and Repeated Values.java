class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int count[] = new int[(grid.length * grid.length)+1];
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid.length ; j++){
                count[grid[i][j]]++;
            }
        }

        int a=-1 , b=-1;

        for(int i=1 ; i<count.length ; i++){
            if(count[i]==2){
                a = i;
            }else if(count[i]==0){
                b = i;
            }
        }
        return new int[] {a,b};
    }
}