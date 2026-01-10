class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        String str = "aeiou";
        
        for(int i=0 ; i<k ; i++){
            if(str.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }

        int max = count;
        for(int i=k ; i<s.length() ; i++){
            if(str.indexOf(s.charAt(i-k)) != -1){
                count--;
            }
            if(str.indexOf(s.charAt(i)) != -1){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}