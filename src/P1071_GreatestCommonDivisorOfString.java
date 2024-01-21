package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1071_GreatestCommonDivisorOfString {
    public String greatestCommonDivisorOfString(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd = gcd(str1.length(),str2.length());
        return str1.substring(0, gcd);
    }
    public int gcd(int a, int b){

        return b==0? a: gcd(b, a%b);
    }

    public static void main(String[] args) {
        P1071_GreatestCommonDivisorOfString p = new P1071_GreatestCommonDivisorOfString();
        String str= p.greatestCommonDivisorOfString("ABCABC","ABC");
        System.out.println(str);
    }
}
