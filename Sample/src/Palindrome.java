public class Palindrome {

    public static void main(String[] args){
        String s1 = "rasar";
        //String s2 = "rasar";
        int j=0, l=s1.length();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s1.charAt(l-i-1)){
                j=1;
                break;
            }
        }
        if(j==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
