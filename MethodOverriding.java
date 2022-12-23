public class MethodOverriding {
    public static void main(String[] args){
        MethodOverriding mo = new MethodOverriding();
        display(12);
    }
    public static void display(int i){
        System.out.println("i"+i);
    }
    public static void display(short j){
        System.out.println("j"+j);
    }
    public static void display(long k){
        System.out.println("k"+k);
    }
}
