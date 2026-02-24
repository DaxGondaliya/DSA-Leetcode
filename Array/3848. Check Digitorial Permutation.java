class Solution {
    public boolean isDigitorialPermutation(int n) {
        int fact[] = {1,1,2,6,24,120,720,5040,40320,362880};
        int num1[] = new int[10];
        int num2[] = new int[10];
        int sum = 0;

        while(n>0){
            sum += fact[n%10];
            num1[n%10]++;
            n /= 10;
        }
        
        while(sum>0){
            num2[sum%10]++;
            sum /= 10;
        }

        for(int i=0 ; i<10 ; i++){
            if(num1[i] != num2[i]) return false;
        }
        return true;
    }
}