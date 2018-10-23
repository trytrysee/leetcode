class Solution {
    public int lengthOfLongestSubstring(String s) {
        // s= "tmmzuxt";
        int n = s.length();
        int ret = 0;
        int l = 0; 
        int r = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < n){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),r);
            }else{
                if(map.get(s.charAt(r)) >= l){ // 注意这里是 >= 因为无论是否跟之前相同都需要让l向前移动
                    l = map.get(s.charAt(r)) + 1;
                }
                map.put(s.charAt(r),r);//用于更新该字符的所在位置，一定位置更靠后了
            }
            r++;
            ret = Math.max(ret,r-l);
            // System.out.printf("l:%d r:%d ret:%d max:%s\n",l,r,ret,s.substring(l,r));
        }
        return ret;
    }
    public int more_optimized_method(String s){
        int n = s.length();
        int ret = 0;
        int l = 0; 
        int r = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < n){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = map.get(s.charAt(r)) + 1;
            }
            map.put(s.charAt(r),r);
            r++;
            ret = Math.max(ret,r-l);
        }
        return ret;
  }
}
