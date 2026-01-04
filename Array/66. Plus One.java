class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]==9){
            ArrayList<Integer> list = new ArrayList<>();
            digits[digits.length-1] += 1;
            for(int i=digits.length-1 ; i>=0 ; i--){
                if(digits[i]==10){
                    list.add(0);
                    if(i>0){
                        digits[i-1] += 1;
                    }else{
                        list.add(1);
                    }
                }else{
                    list.add(digits[i]);

                }
            }
            int arr[] = new int[list.size()];
            for(int i=list.size()-1 ; i>=0 ; i--){
                arr[list.size()-i-1] = list.get(i);
            }
            return arr;
        }
        digits[digits.length-1] += 1;
        return digits;
    }
}