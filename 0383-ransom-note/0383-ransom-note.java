class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]a=new int[26];
       for(char c:magazine.toCharArray()){
        a[c-'a']++;
       }
       for(char c:ransomNote.toCharArray()){
        if(a[c-'a']==0){
            return false;
        }
        a[c-'a']--;
       }
       return true;

    }
}