import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        // Write your code here.
        ArrayList<String> token = new ArrayList<>();
        for (int i = 0; i < s.length() && !s.equalsIgnoreCase(""); i++) {
            if ((s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == ' '
                    || s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == '_'
                    || s.charAt(i) == '\'' || s.charAt(i) == '@')
                    &&
                    i != 0) {
                token.add(s.substring(0, i));
                s = s.substring(i + 1, s.length());
                i = -1;
            }
            else if((s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == ' '
                    || s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == '_'
                    || s.charAt(i) == '\'' || s.charAt(i) == '@')
                    &&
                    i == 0){
                s = s.substring(i+1, s.length());
            }
            else if(i == s.length() - 1) {
                token.add(s);
            }
        }
        System.out.println(token.size());
        for (String str : token) {
            System.out.println(str);
        }
        scan.close();
    }
}