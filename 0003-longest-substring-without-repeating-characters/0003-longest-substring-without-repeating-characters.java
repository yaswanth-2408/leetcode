class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int end=0;
        int max=0;
        List<Character>list=new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max=Math.max(max,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    }
}