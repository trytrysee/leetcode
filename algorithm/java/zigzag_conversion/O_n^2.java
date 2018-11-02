class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }
        int n = s.length();
        List<StringBuilder> list = new LinkedList();
        for(int i = 0; i < numRows; i++){
            list.add(new StringBuilder());
        }
        int row = 0;
        boolean asc = true;
        for(int i =0; i<n; i++){
            StringBuilder str = list.get(row);
            str.append(s.charAt(i));
            if(row == 0){
                row++;
                asc = true;
            }else if(row + 1 == numRows){
                row--;
                asc = false;
            }else if(asc){
                row++;
            }else{
                row--;
            }
        }
        StringBuilder ret = new StringBuilder();
        Iterator<StringBuilder> iter = list.iterator();
        while(iter.hasNext()){
            StringBuilder str = iter.next();
            ret.append(str.toString());
        }
        return ret.toString();
    }
}
