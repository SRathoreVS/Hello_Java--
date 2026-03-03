import java.util.Scanner;

public class DeleteReturnNewArr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome !!");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete : ");
        int numDel = input.nextInt();
        int[] newArr = deletion(numArr,numDel);
    }

    public static int[] deletion(int[] arr, int n){
        int occ = OccurrencesNo.occurances(arr,n);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < arr.length){
            if (arr[i] != n){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

}