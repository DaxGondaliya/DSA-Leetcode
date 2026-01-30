class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int fre = 0;
        int max = 0;
        HashMap<Character,Integer> set = new HashMap<>();

        while(j<s.length()){
            char c = s.charAt(j);
            set.put(c,set.getOrDefault(c,0)+1);
            fre = Math.max(fre,set.get(c));

            while((j-i+1)-fre > k){
                char l = s.charAt(i);
                set.put(l,set.get(l)-1);
                i++;
            }
            
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}