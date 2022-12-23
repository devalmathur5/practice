package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

class Employee{
    private int rollNum;
    private String empName;

    Employee(int roll, String name){
        rollNum = roll;
        empName = name;
    }

    public int getRollNum(){
        return rollNum;
    }
}

public class SortingLambda1 {
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Dev");
        Employee e2 = new Employee(2, "djkldas");
        Employee e3 = new Employee(3, "jfle");
        Employee e4 = new Employee(4, "kmcds");
        Employee e5 = new Employee(5, "afjdklj");

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

        ArrayList<Employee> even = new ArrayList<>();
        ArrayList<Employee> odd = new ArrayList<>();

        for(Employee emp : al.stream().filter(n -> n.getRollNum() % 2 == 0).collect(Collectors.toList())){
            System.out.println(emp.getRollNum());
        };

    }
}
interface funcInterface{
    abstract ArrayList<Employee> sort(ArrayList<Employee> al);
}