import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args){
        int[] array = {1, 5, 5, 6, 2, 8, 9, 9, 3};
//        int[] res = new int[array.length];
        int[] index = new int[array.length];

        for(int i=0; i< array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[i] == array[j] && i != j){
                    index[j] = -1;
                }
            }
        }

        for(int i=0; i<index.length; i++){
            if(index[i] == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
