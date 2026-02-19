class Solution {
    public int countBinarySubstrings(String s) {
        int preCount = 0;
        int currCount = 1;
        int count = 0;

        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currCount++;
            }else{
                count += Math.min(preCount,currCount);
                preCount = currCount;
                currCount = 1;
            }
        }
        count += Math.min(preCount,currCount);
        return count;
    }
}