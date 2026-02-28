class Solution {
    public int mirrorDistance(int n) {
        int org = n;
        int rev = 0;
        while(n>0){
            int lst = n%10;
            rev = rev*10 + lst;
            n /= 10;
        }
        return Math.abs(org-rev);
    }
}