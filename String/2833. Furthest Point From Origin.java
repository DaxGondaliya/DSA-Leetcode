class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int x = 0;
        int cnt=0;
        for(char c : moves.toCharArray()){
            if(c=='L') x++;
            else if(c=='R') x--;
            else cnt++;
        }
        if(x>=0) return x+cnt;
        return Math.abs(x)+cnt;
    }
}