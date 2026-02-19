class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder("");
        for(int i=0 ; i<words.length ; i++){
            int weight = 0;
            int j=0;
            while(j<words[i].length()){
                char ch = words[i].charAt(j);
                weight += weights[ch - 'a'];
                j++;
            }
            int letter = 25 - (weight%26);
            char ch = (char)((int)'a'+letter);
            ans.append(ch);
        }
        return ans.toString();

        
    }
}