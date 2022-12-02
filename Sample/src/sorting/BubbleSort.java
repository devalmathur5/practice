package sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] input = {20, 32, 32, 15, 73, 18, 29};
        bubbleSort(input);
    }

    public static void bubbleSort(int[] input){
        for(int i=0; i<input.length; i++){
            for(int j=0; j< input.length-1; j++){
                if(input[j] > input[j+1]){
                    input[j] = input[j] + input[j+1];
                    input[j+1] = input[j] - input[j+1];
                    input[j] = input[j] - input[j+1];
                }
            }
        }
        for(int i=0; i< input.length; i++){
            System.out.print(input[i]+" ");
        }
    }
}
