import java.util.Scanner;

public class BitWiseOddEven {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your 1st Number : ");
        int num = userInput.nextInt();

        if((num & 1) == 1){
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}