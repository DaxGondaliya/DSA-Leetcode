class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(int i=0 ; i<queries.length ; i++){
            String str = queries[i];
            for(String dict : dictionary){
                int diff=0;
                for(int j=0 ; j<str.length() ; j++){
                    if(dict.charAt(j)!=str.charAt(j)) diff++;
                    if(diff>2) break;
                }
                if(diff<=2){
                    ans.add(str);
                    break;
                }
            }
        }
        return ans;
    }
}