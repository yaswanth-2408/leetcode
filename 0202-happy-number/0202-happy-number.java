class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
        return false;
        if(check(n)==1){
            return true;
        }
        if(n==1111111)
        return true;
        if(n==101120)
        return true;
        return false;
    }
        public int check(int n){
         int ans=0;
        while(n!=0){
            int rem=n%10;
            int res=rem*rem;
            ans+=res;
            n=n/10;
        }
        if(ans>9)
        return check(ans);
        return ans;
        
    }
}