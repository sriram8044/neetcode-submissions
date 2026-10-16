class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> store = new HashSet<>();
        
        
        for(int i = 0 ; i < nums1.length ; i++){
           set.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                store.add(nums2[i]);
            }
        }
        int a[] = new int [store.size()];
        int i = 0 ;
        for(int v : store){
            a[i] = v;
            i++;
        }
        return a;
    }
}