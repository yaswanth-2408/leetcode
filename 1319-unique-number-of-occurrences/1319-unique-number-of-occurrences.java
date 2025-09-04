class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer>set=new HashSet<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int freq=entry.getValue();
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}