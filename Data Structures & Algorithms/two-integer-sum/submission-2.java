class Solution {
    public int[] twoSum(int[] a, int t) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < a.length ; i++){
            int diff = t - a[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff) , i};
            }

            map.put(a[i] , i);
        }
        return new int[]{};
    }
}
