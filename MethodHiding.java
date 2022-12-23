class Parent{
    void display(){
        System.out.println("Parent");
    }

    int add(int a, int b){
        return a + b;
    }
}

class Child extends Parent{
    // final methods can not be overridden
    // but in child class a final method can override non-final method of the parent class.
    final void display(){
        System.out.println("Child");
    }

    // return type should be same. the type and number of parameters should be diff.
//    float add(int a, int b){
//        return (float)(a + b);
//    }
}

public class MethodHiding {
    public static void main(String[] arg){
        Parent obj = new Child();
        obj.display();
    }
}

