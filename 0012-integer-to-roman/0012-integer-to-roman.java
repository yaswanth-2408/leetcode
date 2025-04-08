class Solution {
    public String intToRoman(int num) {
        int[]val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(num>=val[i]){
                num-=val[i];
                 res.append(symbol[i]);
            }
        }
        return res.toString().trim();
    }
}