class Solution {
    public int strStr(String haystack, String needle) {
        int a=haystack.indexOf(needle);
        if(a!=-1){
            return a;
        }
        return -1;
    }
}