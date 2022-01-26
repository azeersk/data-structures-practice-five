import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class linearClass {

    public static int linearSearch(int[] array, int k){
        for(int i=0; i<array.length; i++){
            if(array[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] array = new int[5];
        for(int i=0; i<array.length; i++){
            array[i] = i*3;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("linear search algorithm used after: ");
        int value = linearSearch(array,k);
        if(value == -1){
            System.out.println("given element is not found!!");
        }
        else{
            System.out.println(k+" index is at "+value);
        }

    }
}
