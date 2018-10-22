class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ret = 0;
        int l = 0; 
        int r = 0;
        Set<Character> set = new HashSet<>();
        while(r < n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                ret = Math.max(ret,r-l);
                //System.out.printf("Now:%s max:\n",s.substring(l,r),ret);
            }else{
                set.remove(s.charAt(l));
                l++;
                //System.out.printf("sub max:%s max:%d\n",s.substring(l,r),ret);
                
            }
        }
        return ret;
    }
}
