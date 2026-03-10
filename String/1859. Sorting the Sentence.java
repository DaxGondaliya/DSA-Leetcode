class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String ans[] = new String[arr.length];

        for(String w : arr){
            int idx = w.charAt(w.length()-1) - '1';
            ans[idx] = w.substring(0,w.length()-1);
        }
        return String.join(" " , ans);
    }
}