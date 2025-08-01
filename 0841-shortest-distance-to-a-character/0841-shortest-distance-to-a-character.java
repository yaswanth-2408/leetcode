class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int []res=new int[n];
        int prev=Integer.MIN_VALUE/2;
        for(int i=0;i<n;i++){
            char cc=s.charAt(i);
            if(c==cc){
                prev=i;
            }
            res[i]=i-prev;
        }
        prev=Integer.MAX_VALUE/2;
        for(int i=n-1;i>=0;i--){
            char cc=s.charAt(i);
            if(cc==c){
                prev=i;
            }
            res[i]=Math.min(res[i],prev-i);
        }
        return res;
    }
}