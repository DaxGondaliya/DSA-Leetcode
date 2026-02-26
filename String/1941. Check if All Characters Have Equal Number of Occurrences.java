class Solution {
    public boolean areOccurrencesEqual(String s) {
        //Using Hashmap
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i=0 ; i<s.length() ; i++){
        //     map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        // }
        // int count = 0;
        // for(Character ch : map.keySet()){
        //     if(count==0){
        //         count = map.get(ch);
        //     }else if(count != map.get(ch)){
        //         return false;
        //     }
        // }
        // return true;

        //using count array
        int fre[] = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            fre[s.charAt(i)-'a']++;
        }

        int target = 0;
        for(int f : fre){
            if(f>0){
                target = f;
                break;
            }
        }

        for(int f : fre){
            if(f>0 && f!=target){
                return false;
            }
        }
        return true;
    }
}