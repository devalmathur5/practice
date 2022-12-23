public class PatternJavaInt {
    /*
input a = [3,4,5,6]
Write a logic that display below.
Output
(9,16,25,36)
(9,16,25)
(9,16)
(9)
     */

    public static void main(String[] args){
        int[] a = {3, 4, 5, 6};
        int length = a.length;
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< length; j++){
                System.out.print(a[j]*a[j] + " ");
            }
            System.out.println();
            length--;
        }
    }
}

