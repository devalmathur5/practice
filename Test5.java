public class Test5 {
    public static void main(String[] args){
        String str = "address_line_first";
        System.out.println(func(str));
    }

    public static String func(String input){
        int count=0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '_'){
                count++;
            }
        }

        String[] token = new String[count];

        String result = "";
        for(int i=0, j=0; i<=input.length() - 2 && j<count && !input.equals(""); i++){
            if(input.charAt(i) == '_'){
                token[j] = input.substring(0, i);
                j++;
                String upper = (char)(input.charAt(i+1) + 98) + "";
                input = upper + input.substring(i+2, input.length());
                i = -1;
            }
            else if(i == input.length() - 2){
                token[j] = input.substring(0, i);
                j++;
                String upper = (char)(input.charAt(i+1) + 98) + "";
                input = upper + input.substring(i+2, input.length());
                i = -1;
            }
        }

        for(int i =0; i<token.length; i++){
            result = result + token[i];
        }
        return result;
    }
}
