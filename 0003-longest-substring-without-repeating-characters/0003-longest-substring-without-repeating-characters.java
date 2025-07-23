class Solution {
    public int lengthOfLongestSubstring(String s) {
        int end=0;
        int st=0;
        int max=0;
        Set<Character>set=new HashSet<>();
        while(end<s.length()){
            char c=s.charAt(end);
            if(set.contains(c)){
                set.remove(s.charAt(st));
                st++;
            }
            else{
                set.add(c);
                max=Math.max(max,end-st+1);
                end++;
            }
        }
        return max;
    }
}