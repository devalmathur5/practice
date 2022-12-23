import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> token = new ArrayList<>();
        for(int i=0; i<s.length() && !s.equalsIgnoreCase(""); i=0){
            if(s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == ','
                    || s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == '_'
                    || s.charAt(i) == '\''  || s.charAt(i) == '@' ){
                String left = s.substring(0, i);
                token.add(left);
                s = s.substring(i+1, s.length());
            }
        }
        System.out.println(token.size());
        for(String str : token){
            System.out.println(str);
        }
        scan.close();
    }
}
