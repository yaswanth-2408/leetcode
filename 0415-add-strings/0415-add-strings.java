import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // StringBuilder str=new StringBuilder();
        // int i=num1.length()-1;
        // int j=num2.length()-1;
        // int carry=0;
        // while(i>=0 || j>=0 || carry>0){
        //     int digit1=(i>=0)?num1.charAt(i)-'0':0;
        //     int digit2=(j>=0)?num2.charAt(j)-'0':0;
        //     int sum=digit1+digit2+carry;
        //     carry=sum/10;
        //     str.append(sum%10);
        //     i--;
        //     j--;
        // }
        // return str.reverse().toString();
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return a.add(b).toString();
    }
}