public class SingletonClass {

    static class Singleton{
        private Singleton(){}

        public Singleton getObject(){
            return new Singleton();
        }
    }

    public static void main(String[] args){
        Singleton obj = new Singleton();
        Singleton obj1 = new Singleton();

        System.out.println(obj + " " + obj1);
    }
}

