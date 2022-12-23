public class Test6 {

    public static void main(String[] args){
        String str = "ABC";
        String[] resp = new String[str.length()*2];

        for(int i=0; i<str.length(); i++){
            String temp = str.charAt(i) + "";
                for (int j = 0, k=0; j < str.length() && i != j && k< resp.length; j++, k++) {
                    String temp2 = str.charAt(j) + "";
                    String append = temp + temp2;
                    resp[k] = append;
                }
            }

        for(String s : resp){
            System.out.print(s+" ");
        }
    }
}
