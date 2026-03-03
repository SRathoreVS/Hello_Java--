import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sorted Array Check");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isSortedInc(numArr);
        boolean isDec = isSortedDec(numArr);
        if(isInc || isDec){
            System.out.println("Your array is sorted");
        } else {
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isSortedInc(int[] arr){
        int i = 1;
        while (i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isSortedDec(int[] arr){
        int i = 1;
        while (i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}