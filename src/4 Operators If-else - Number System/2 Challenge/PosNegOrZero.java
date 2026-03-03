import java.util.Scanner;

public class PosNegOrZero {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = userNum.nextInt();

        if(num > 0){
            System.out.println("The " + num + "is positive");
        } else if (num < 0) {
            System.out.println("The " + num + "is negative");
        } else {
            System.out.println("The " + num + " is Zero");
        }
    }
}