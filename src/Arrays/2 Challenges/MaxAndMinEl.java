import java.util.Scanner;

public class MaxAndMinEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Determine the MAX and MIN values: ");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max is :" + max);
        System.out.println("Min is :" + min);

    }

    public static int max(int[] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}