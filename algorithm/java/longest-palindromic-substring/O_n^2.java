class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        String ret = s;
        for(int i = 0; i < n ; i++ ){
            for(int l = i+1; l <= n; l++){
                // System.out.printf("Input:%s i:%d l:%d\n",s.substring(i,l),i,l);
                boolean isExp = isPalindromic(s.substring(i,l));
                if(isExp && l-i > max){
                    max = l-i;
                    ret = s.substring(i,l);
                    // System.out.printf("max:%d ret:%s\n",max,ret);
                }
            }
        }
        return ret;
        
    }
    private boolean isPalindromic(String s){
        
        int l = 0;
        int r = s.length() -1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                // System.out.printf("Not palindromic:%s\n",s);
                return false;
            }
            l++;
            r--;
        }
        // System.out.printf("palindromic:%s\n",s);
        return true;
    }
}
