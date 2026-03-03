public class PalindromeArr {

    public static void main(String[] args) {
        System.out.println("Welcome to Array Palindrome");
        int[] numArr = ArrayUtility.inputArray();
        boolean result = isPalindrome(numArr);

        System.out.println("Is Palindrome? : " + result);

    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[(arr.length -1) - i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
