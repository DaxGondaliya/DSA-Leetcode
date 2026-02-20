class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int count[] = new int[101];

        for (int bulb : bulbs) {
            count[bulb]++;
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {

            if (count[i] % 2 == 1) {
                res.add(i);
            }
        }

        return res;
    }
}