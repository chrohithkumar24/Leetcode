class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            String sub=" ";
            for(int j=i;j<n;j++){
                // sub+=s.charAt[j];
                if(isPalindrome(s,i,j)){
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean isPalindrome( String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}