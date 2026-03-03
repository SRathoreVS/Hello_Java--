public class ReverseArr {

    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverse");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.print("Your reverse array is :");

        int i = 0;
        while (i < numArr.length) {
            System.out.print(numArr[i] + " ");
            i++;
        }

    }

    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}