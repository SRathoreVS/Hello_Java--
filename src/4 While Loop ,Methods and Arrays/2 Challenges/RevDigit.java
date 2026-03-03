import java.util.Scanner;

public class RevDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int numb = input.nextInt();
        int finalOut = reverse(numb);
        System.out.println("The reversed Number is : " + finalOut);
        boolean isPalindrome = palindromeCheck(numb);
        if(isPalindrome){
            System.out.println("your number is palindrome");
        } else {
            System.out.println("you number is not palindrome");
        }

    }
    public static boolean palindromeCheck(int num) {
        int reverse = reverse(num);
        return  num == reverse;
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num%10;
            newNum = newNum*10 + digit;
            num/=10;
        }
        return newNum;
    }
}