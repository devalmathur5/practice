package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Emp{
    int age;
    String name;

    Emp(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

public class Test4 {
    public static void main(String[] args){
        Employee e1 = new Employee(19, "dsfds");
        Employee e2 = new Employee(45, "sdfa");
        Employee e3 = new Employee(76, "fdsf");
        Employee e4 = new Employee(34, "abcc");

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        al.sort(Comparator.comparing(Employee::getRollNum));
        for(Employee emp : al)
        System.out.println(emp.getRollNum());
    }
}

interface lambda{
    public void func(ArrayList<Emp> al);
}