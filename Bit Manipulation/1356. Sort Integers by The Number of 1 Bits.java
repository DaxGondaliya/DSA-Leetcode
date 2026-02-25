class Solution {
    public int[] sortByBits(int[] arr) {
        //Need to make Integer Arrays because custom comparator only
        // work woth Integer
        Integer x[] = new Integer[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            x[i] = arr[i];
        }

        Arrays.sort(x,(a,b) -> {
            int ba = Integer.bitCount(a);
            int bb = Integer.bitCount(b);

            if(ba != bb){
                return ba-bb;
            }
            return a-b;
        });

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = x[i];
        }
        return arr;
    }
}