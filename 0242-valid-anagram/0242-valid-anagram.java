class Solution {
    public boolean isAnagram(String s, String t) {
            Map<Character,Integer>hash=new HashMap<>();
            for(char c:s.toCharArray()){
                hash.put(c,hash.getOrDefault(c,0)+1);
            }
            for(char c:t.toCharArray()){
                hash.put(c,hash.getOrDefault(c,0)-1);
            }
            for(int i:hash.values()){
                if(i!=0){
                    return false;
                }
            }
            return true;
    }
}