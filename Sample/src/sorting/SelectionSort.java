package sorting;
//select the min value from the array and place it to the appropriate position
public class SelectionSort {
    public static void main(String[] args){
        int[] input = {20, 32, 15, 73, 18, 29};
        selectionSort(input);
    }

    public static void selectionSort(int[] input){
        // 5, 6, 1, 8, 2, 6
        for(int i=0; i<input.length; i++){
           int min = i;
            for(int j=i; j<input.length-1; j++){
                if(input[min] > input[j+1]){
                    input[min] = input[min] + input[j+1];
                    input[j+1] = input[min] - input[j+1];
                    input[min] = input[min] - input[j+1];
                }
            }
        }
        for(int i=0; i< input.length; i++){
            System.out.print(input[i]+" ");
        }
    }
}
