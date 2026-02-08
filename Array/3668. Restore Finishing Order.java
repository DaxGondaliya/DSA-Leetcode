class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hash = new HashSet<>();
        for(int id : friends){
            hash.add(id);
        }

        int res[] = new int[friends.length];
        int j=0;
        for(int i=0 ; i<order.length ; i++){
            if(hash.contains(order[i])){
                res[j++] = order[i];
            }
        }
        return res;
    }
}