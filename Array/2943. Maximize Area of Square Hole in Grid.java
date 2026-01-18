class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int verical = maxcontinuosbar(vBars);
        int horizontal = maxcontinuosbar(hBars);

        int square = Math.min(verical,horizontal)+1;

        return square*square;
    }

    public int maxcontinuosbar(int arr[]){
        int count = 1;
        int max = 1;

        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]-1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 1;
            }
        }
        return max;
    }
}