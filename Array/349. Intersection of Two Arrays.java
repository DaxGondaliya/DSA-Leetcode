class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList <Integer> list = new ArrayList<>();
        int i=0 , j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                if(list.indexOf(nums1[i])==-1){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int result[] = new int[list.size()];
        for(int k=0 ; k<result.length ; k++){
            result[k] = list.get(k);
        }
        return result;
     }
}