class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        int l = 0;
        int r = 0;
        int n = s.length();
        int max = 0;
        for(int i = 0; i < n; i++){
            int max1 = getMaxPalindrome(s,i,i);
            int max2 = getMaxPalindrome(s,i,i+1);
            int len = Math.max(max1,max2);
            if(max < len){
                max = len;
                if(len%2 == 0){
                    r = i + len/2;
                    l = i - len/2 + 1;
                }else{
                    r = i + (len-1)/2;
                    l = i - (len-1)/2;
                }
                System.out.printf("%d -> %d (%s)\n",i,len,s.substring(l,r+1));
            }
        }
        return s.substring(l,r+1);
    }
    private int getMaxPalindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    
}
