package stream;

import java.util.ArrayList;

public class DuplicateNumbersStream {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.stream().distinct().forEach(n -> System.out.println(Math.pow(n, 2)));
    }
}
