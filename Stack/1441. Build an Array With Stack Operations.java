class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int num = 1;
        for(int i=0 ; i<target.length ; i++){
            ans.add("Push");
            if(num != target[i]){
                ans.add("Pop");
                i--;
            }
            num++;
        }
        return ans;
    }
}