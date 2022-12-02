//Wipro
public class Test1 {
    public static void main(String[] args) {
        int num = 3 * 2;
        System.out.println(add(bit(num)));
    }
    public static int bit(int num){
        String sol = "";
        while(num >= 1){
            sol = sol + num%2 + "";
            num = num/2;
        }
        System.out.println("sol " +sol);
        return Integer.parseInt(sol);
    }
    public static int add(int n){
        int ret=0;
        String str = n + "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                ret++;
            }
        }

        System.out.println("ret "+ret);
        return ret;
    }
}
