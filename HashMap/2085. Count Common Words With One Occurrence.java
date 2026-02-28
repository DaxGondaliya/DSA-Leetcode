class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> map = new HashMap<>();

        for(String s : words1){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s : words2){
            if(map.containsKey(s) && map.get(s)<=1){
                map.put(s,map.get(s)-1);
            }
        }

        int c = 0;
        for(int v : map.values()){
            if(v==0){
                c++;
            }
        }
        return c;
    }
}