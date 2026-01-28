class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max = 0;
        int r = tokens.length-1;
        int count = 0;
        for(int i=0 ; i<tokens.length ; i++){
            if(power>=tokens[i]){
                power -= tokens[i];
                count++;
                max = Math.max(max,count);
            }else if(count>0){
                power += tokens[r--];
                count--;
                i--;
            }else{
                break;
            }
        }
        return max;
    }
}