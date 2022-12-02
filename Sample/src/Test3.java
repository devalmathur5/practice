import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test3 {
    public static void main(String[] args){
        String str = "hi hello hi";
        // code to find out the substrings of a string.
        int count=1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;            }
        }
        String[] token = new String[count];

        for(int i=0, j=0; i<str.length() && j<token.length; i++){
            if(i==str.length()-1 || str.charAt(i)==' '){
                token[j] = str.substring(0, i);
                if(i==str.length()-1) {
                    token[j] = str;
                }
                else {
                    str = str.substring(i + 1, str.length());
                }
                j++;
                i=-1;
            }
        }
        

        // code to find out the number of distinct substring
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<token.length; i++){
            int temp=0;
            for(int j=0; j<token.length; j++){
                if(token[i].equalsIgnoreCase(token[j])){
                    hm.put(token[i], ++temp);
                }
            }
        }
        for(Map.Entry<String, Integer> es : hm.entrySet()){
            System.out.println(es.getKey() + "     " + es.getValue());
        }
    }
}
