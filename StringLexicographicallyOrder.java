public class StringLexicographicallyOrder {
    public static void main(String[] args){
        String str = "abcdezq";
        int k = 2;
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<i; j++){
                count++;
            }
        }
        String[] result = new String[count];
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String temp = str.substring(i, j);
                if(temp.length()==k)
                    result[i] = temp;
            }
        }

    }
    public static String returnMinString(String str1, String str2){

        for(int i=0; i<str1.length(); i++){

        }

        return "";
    }
}
