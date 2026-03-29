class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for(int i=0 ; i<4 ; i++){
            char ch = s1.charAt(i);
            if(s2.charAt((i+2)%4)!=ch && s2.charAt(i)!=ch) return false;
        }
        return true;
    }
}