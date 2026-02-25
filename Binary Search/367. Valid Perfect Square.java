class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while(l<=r){
            long mid = (l+r)/2;
            long square = mid*mid;
            if(num==square)
                return true;
            else if(square<num)
                l = mid+1;
            else
                r = mid-1;
        }
        return false;
    }
}