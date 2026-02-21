class Solution {
    public int countPrimeSetBits(int left, int right) {
        int prime = 0;
        for(int i=left ; i<=right ; i++){
            int setbits = Integer.bitCount(i);
            if(isPrime(setbits)){
                prime++;
            }
        }
        return prime;
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}