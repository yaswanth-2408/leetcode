class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        String[]arr=s1.split(" +");
        String[] arr1=s2.split(" +");
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        for(String str:arr1){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        String[]ss=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ss[i]=list.get(i);
        }
        return ss;
    }
}