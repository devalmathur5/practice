/*
check if two strings can be equal after rearranging the letters
xyz is zxy
abc is not saf
 */

import java.util.Scanner;

public class StringManipulation{
    public static void main(String[] args){
        String str1 = new Scanner(System.in).next();
        String str2 = new Scanner(System.in).next();
        String result = stringCheck(str1, str2);
        System.out.println(result);
    }

    public static String stringCheck(String input1, String input2){
        int l = input1.length();
        boolean res = false;

        for(int i=0; i<l; i++){
            char ch1 = input1.charAt(i);
            for(int j=0; j<l; j++){
                if(ch1 == input2.charAt(j)){
                    String left = input2.substring(0, j);
                    String right = input2.substring(j+1, l);
                    String result = left + right;
                    if(result.equals("")){
                        res = true;
                    }
                }
            }
        }

        if(res)
            return "yes";
        return "no";
    }

}