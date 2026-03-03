import java.util.Scanner;

public class OccurrencesNo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("array occurences");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the element to find: ");
        int num = input.nextInt();
        int noOfCoccurence = occurances(numArr,num);
        System.out.println("Count of " + num + " is : " + noOfCoccurence);
    }

    public static int occurances(int[] arr,int target){
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                count++;
            }
            i++;
        }
        return count;
    }
}