class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int start = 0 , end = 0;
        int fre = 0 , max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(end<answerKey.length()){
            char ch = answerKey.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            fre = Math.max(fre,map.get(ch));

            while((end-start+1)-fre > k){
                char l = answerKey.charAt(start);
                map.put(l,map.get(l)-1);
                start++;
            }

            max = Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}