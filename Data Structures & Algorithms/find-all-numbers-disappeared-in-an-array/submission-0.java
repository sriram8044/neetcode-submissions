class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 1 ; i <= nums.length ; i++){
            map.put(i , 0);
        }

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
            }
        }

        for(int i = 1 ; i <= map.size() ; i++){
            if(map.get(i)==0){
                list.add(i);
            }
        }
        return list;
    }
}