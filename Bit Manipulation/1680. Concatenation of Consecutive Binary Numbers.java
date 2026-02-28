class Solution {
    public int concatenatedBinary(int n) {
        int modulo = (int)1e9 + 7;
        long res = 0;
        int bit = 0;
        for(int i=1 ; i<=n ; i++){
            if((i & (i-1)) == 0){ // chech how many bits shift needed
                bit++;
            }
            res = ((res<<bit) | i) % modulo;
        }
        return (int)res;
    }
}