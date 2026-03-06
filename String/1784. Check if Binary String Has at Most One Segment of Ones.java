class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.contains("01") && s.contains("10")) return false;
        return true;
    }
}