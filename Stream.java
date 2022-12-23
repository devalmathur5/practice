import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("infosys");
        list.add("tcs");
        list.add("accenture");

        List<String> list1 = new ArrayList<>();

        list1 = list.stream().sorted(Comparator.comparing(p -> p.charAt(p.length()-2))).collect(Collectors.toList());

        for(String str : list1){
            System.out.println(str);
        }
    }
}

