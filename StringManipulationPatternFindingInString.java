public class StringManipulationPatternFindingInString {

    public static void main(String[] args){
        String str = "ABAABAAABABBACABAACCACABA";
        String pattern = "AB";

        int count = 0;
        for(int i=0; i<str.length()-pattern.length(); i++){
            String temp = str.substring(i, pattern.length()+i);
            if(temp.equalsIgnoreCase(pattern)){
                count++;
            }
        }
        System.out.println(count);
    }
}
