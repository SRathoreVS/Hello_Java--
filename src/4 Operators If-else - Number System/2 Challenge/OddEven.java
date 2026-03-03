import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = userNum.nextInt();

        if(num % 2 == 0){
            System.out.println("the " + num + " is even number");
        } else {
            System.out.println("the " + num + " is odd number");
        }
    }
}