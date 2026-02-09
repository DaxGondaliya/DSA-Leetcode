class Solution {
    public boolean checkString(String s) {
        boolean b = false;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == 'b'){
                b = true;
            }else if(ch == 'a' && b){
                return false;
            }
        }
        return true;
    }
}