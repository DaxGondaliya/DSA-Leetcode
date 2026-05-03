class Solution {
    public boolean rotateString(String s, String goal) {
        String rotate = s+s;
        if(s.length()>goal.length() || s.length()<goal.length()) return false;
        if(rotate.contains(goal)) return true;
        return false;
    }
}