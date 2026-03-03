import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,4,5,7,9,1,55,62,88,94};
        System.out.print("Array Searching = Enter the num : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("Your num was found in Array");
        } else {
            System.out.println("Your num was not found in Array");
        }
    }

    public static boolean isFound(int[] arr,int num){
        int i =0 ;
        while (i < arr.length){
            if(arr[i] == num){
                return true;
            }
            i++;
        }
        return false;
    }
}