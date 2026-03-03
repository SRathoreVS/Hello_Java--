import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        readNumber();
    }

    public  static void greet(){
        System.out.println("irrashai");
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your 1st Num: ");
        int first = input.nextInt();
        System.out.print("Please enter your 2nd Num: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("The sum of 2 numbers is " + sum);
        return sum;
    }


}