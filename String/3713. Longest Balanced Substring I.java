class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        int n = s.length();

        for(int i=0 ; i<n ; i++){
            int fre[] = new int[26];

            for(int j=i ; j<n ; j++){
                char ch = s.charAt(j);
                fre[ch-'a']++;

                if(isSamefre(fre)){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public boolean isSamefre(int arr[]){
        int firstval = 0;

        for(int i=0 ; i<26 ; i++){
            if(arr[i]==0){
                continue;
            }

            if(firstval == 0){
                firstval = arr[i];
            }else if(firstval != arr[i]){
                return false;
            }
        }
        return true;
    }
}