class Solution {
    public String smallestNumber(String pattern) {
        int i;
        Stack<Integer> stack = new Stack<>();
        StringBuilder ans = new StringBuilder("");

        for(i=0 ; i<pattern.length() ; i++){
            stack.push(i+1);

            if(pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
        }

        stack.push(i+1);

        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}