public class StaticClass {

    static final int i = 1000;
    static class Demo{
        int i = 0;
    }

    public static void main(String[] args){
        Demo dem = new Demo();
        dem.i = 100;

        class InnerDemo{
            int i = 1;
            Demo dem = new Demo();
           // dem.i =   1000; // <- why? You can't have static fields/method in a regular inner classes, because, inner classes will work only with instance of outer classes.
            StaticClass sc = new StaticClass();
           int j = sc.i;
        }
    }
}
