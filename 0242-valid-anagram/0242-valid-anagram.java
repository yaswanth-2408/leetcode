class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
            char[] c=s.toCharArray();
            char[] cc=t.toCharArray();
            Arrays.sort(c);
            Arrays.sort(cc);
            for(int i=0;i<c.length;i++){
                if(c[i]!=cc[i]){
                    return false;
                }
            }
            return true;
    }
}