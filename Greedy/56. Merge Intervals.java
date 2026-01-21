class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        int[] pre = intervals[0];

        for(int i=1 ; i<intervals.length ; i++){
            if(pre[1]>=intervals[i][0]){
                pre[1] = Math.max(pre[1],intervals[i][1]);
            }else{
                list.add(pre);
                pre = intervals[i];
            }
        }
        list.add(pre);
        return list.toArray(new int[list.size()][]);
    }
}