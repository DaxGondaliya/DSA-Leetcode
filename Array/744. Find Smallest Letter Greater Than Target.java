class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        boolean flag = false;

        for(char ch : letters){
            if(!flag && ch>target){
                res = ch;
                flag = !flag;
            }else{
                if(ch>target && ch<res){
                    res = ch;
                }
            }
        }
        return res;
    }
}