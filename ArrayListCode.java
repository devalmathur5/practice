public class ArrayListCode {

    public static void main(String[] args){
        int[][] array1 = {{1, 2, 3}, {4, 3, 2}, {5, 8, 6}};
        int[][] array2 = {{10, 12, 3}, {14, 33, 20}, {9, 0, 7}};

        int[] array = new int[18];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1.length; j++){
                for(int k=0; j<array1[j].length; k++){
                    array[i] = array1[i][j];
                }
            }
        }

        for(int i=array1.length; i<array.length; i++){
            for(int j=0; j<array2.length; j++){
                for(int k=0; j<array2[j].length; k++){
                    array[i] = array2[i][j];
                }
            }
        }

        for(int i=0; i<array.length; i++){
            int value = array[i];
            for(int j=0; j<array.length; j++){
                if(value > array[j]){
                    int swap = value;
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

