class Solution {
    public boolean hasDuplicate(int[] a) {
        HashSet<Integer>  set = new HashSet<>();
        int n  = a.length;
        for(int i = 0 ; i < n ; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
            else{
                 return true;
            }
        }
                return false;
    }
}