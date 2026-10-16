class Solution {
    public boolean isPalindrome(String s1) {
        int n = s1.length();
        String s = s1.toLowerCase();

        int i = 0 ; int j = n-1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++ ; 
                j--;
            }
            else if(s.charAt(i) == ' ' ){
                i++;
            }
            else if(s.charAt(j) == ' ' ){
                j--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else{
                return false;
            }
          
        }
        return true;
    }
}
