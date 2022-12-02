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


        for(int i=0; i< token.length; i++){
            System.out.println(token[i]);
        }

        // code to find out the number of distinct substring
    }
}
