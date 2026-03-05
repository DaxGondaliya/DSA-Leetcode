class Solution {
    public int minOperations(String s) {
        int c1 = 0 ; //for string start with 0
        int c2 = 0 ; //for string start with 1

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(i%2==0){
                if(ch != '0') c1++;
                if(ch != '1') c2++;
            }else{
                if(ch != '1') c1++;
                if(ch != '0') c2++;
            }
        }
        return Math.min(c1,c2);
    }
}