import java.util.Arrays;
import java.util.Scanner;

public class binarySearchClass {
    public static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length;
        while (start < end){
            int mid = (start + end)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = start + 1;

            }
            else{
                end = end - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] array = new int[6];
        for (int i=0; i< array.length; i++){
            array[i] = i*4;
        }

        int k = input.nextInt();
        System.out.println(Arrays.toString(array));
        int value = binarySearch(array,k);

        if(value == -1){
            System.out.println();
        }
        else{
            System.out.println("given integer at : " + value);
        }
        System.out.println("binary search is completed!!");
    }
}
