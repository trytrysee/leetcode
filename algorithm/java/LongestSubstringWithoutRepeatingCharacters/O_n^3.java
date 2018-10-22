class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ret = 0;
        for(int l = 0; l < n ; l++){
            for(int r = l; r < n; r++){
                Set<Character> set = new HashSet<>();
                boolean uniqu = true;
                for(int p = l; p <= r; p++){
                    if(!set.contains(s.charAt(p))){
                        set.add(s.charAt(p));
                    }else{
                        uniqu = false;
                    }
                }
                if(uniqu){
                    ret = Math.max(ret,r-l+1);
                }
            }
        }
        return ret;
    }
}
