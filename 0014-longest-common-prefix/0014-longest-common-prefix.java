class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str=strs[0];
        String str1=strs[strs.length-1];
        int ind=0;
        while(ind<str.length()){
            if(str.charAt(ind)==str1.charAt(ind)){
                ind++;
            }
            else{
                break;
            }
        }
        return strs.length==0?"":str.substring(0,ind);
    }
}