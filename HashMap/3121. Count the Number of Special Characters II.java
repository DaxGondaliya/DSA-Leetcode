class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        HashMap<Character,Integer> lower = new HashMap<>();
        HashMap<Character,Integer> upper = new HashMap<>();
        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z') lower.put(ch,i);
            else if(!upper.containsKey(ch)) upper.put(ch,i);
        }
        for(char ch : upper.keySet()){
            char lc = Character.toLowerCase(ch);
            if(lower.containsKey(lc) && upper.get(ch)>lower.get(lc)) cnt++;
        }
        return cnt;
    }
}