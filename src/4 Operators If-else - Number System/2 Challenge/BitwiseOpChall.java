import java.util.Scanner;

public class BitwiseOpChall {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your 1st Number : ");
        int n1 = userInput.nextInt();
        System.out.print("Enter your 2nd Number : ");
        int n2 = userInput.nextInt();

        int result1 = n1 & n2;
        System.out.println("result is "+ result1);
        int result2 = n1 | n2;
        System.out.println("result is "+ result2);
        int result3 = n1 ^ n2;
        System.out.println("result is "+ result3);
        int result4 = ~n1;
        System.out.println("result is "+ result4);
    }
}