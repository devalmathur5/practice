import java.util.Optional;

public class StringAnagram {
    public static void main(String[] args){
        String a = "abcde", b = "xyzwf";
        System.out.println(isAnagram(a, b));
    }
    public static String isAnagram(String a, String b){
        //String res = null;
        if(a.length() != b.length()){
            return "Not anagram";
        }
        for(int i=0; i<a.length(); i++){
            String ch = a.charAt(i) + "";
            for(int j=0; j<b.length(); j++){
                if(ch.equalsIgnoreCase(b.charAt(j) + "")) {
                    String left = b.substring(0, j);
                    String right = b.substring(j + 1, b.length());
                    b = left + right;
                    break;
                }
            }
        }
        System.out.println(b);
        if(b.equals("")){
            return "Anagram";
        }
        return "Not Anagram";
    }
}
