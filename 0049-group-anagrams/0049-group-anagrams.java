class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> hash=new HashMap<>();
        for(String s:strs){
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String sort=new String(c);
            if(!hash.containsKey(sort)){
                hash.put(sort,new ArrayList<>());
            }
            hash.get(sort).add(s);
        }
        res.addAll(hash.values());
        return res;
    }
}