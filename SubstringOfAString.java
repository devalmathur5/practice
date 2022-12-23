import java.util.ArrayList;

/*
1854 - 1945
2010 -
 */
public class SubstringOfAString {
    public static void main(String[] args){
        String str = "abcd";
        ArrayList<String> al = new ArrayList<>();
/*
i 0, 1, 2, 3
j 1, 2, 3, 2, 3, 3, 0, 1, 2, 3
 */
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String temp = str.substring(i, j);
                al.add(temp);
            }
        }
        System.out.println(" "+str.substring(0, 0)+" ");
        for(String s : al){
            System.out.print(s+ " ");
        }
        System.out.println(al.size());
    }
}
