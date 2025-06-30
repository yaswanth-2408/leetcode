class Solution {
    public String reverseVowels(String s) {
       int n=s.length();
       char[] cc=s.toCharArray();
       int st=0;
       int end=s.length()-1;
       while(st<end){
        if(!isvowel(cc[st])){
            st++;
        }
        else if(!isvowel(cc[end])){
            end--;
        }
        else{
            char temp=cc[st];
            cc[st]=cc[end];
            cc[end]=temp;
            st++;
            end--;
        }
       }
       return String.valueOf(cc);
    }
    public static boolean isvowel(char cc){
        if(cc=='a' || cc=='e' || cc=='i'||cc=='o'||cc=='u' || cc=='A' || cc=='E'||cc=='I'||cc=='O'||cc=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}