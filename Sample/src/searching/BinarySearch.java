package searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] input = {2, 4, 5, 7, 8, 9};
        int pos, num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        pos = binarySearch(input, num);
        if(pos != -1)
            System.out.println("number " + num + "found at position " + pos);
        else
            System.out.println("number not found");
    }

    public static int binarySearch(int[] input, int num){
        int start, mid, end;
        start = 0;
        end = input.length-1;

        while(start <= end){
            mid = (start + end) / 2;
            if(num == input[mid]){
                return mid + 1;
            }
            if(num > input[mid]){
                start = mid + 1;
            }
            if(num < input[mid]){
                end = mid - 1;
            }
        }

        return -1;
    }
}
