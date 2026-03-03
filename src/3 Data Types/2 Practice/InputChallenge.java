import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        Scanner inpName = new Scanner(System.in);
        System.out.print("please enter your name: ");
        String name = inpName.nextLine();
        System.out.println("Welcome "+ name + " to KG Coding");

        Scanner n = new Scanner(System.in);
        System.out.print("please enter number 1 : ");
        int num1 = n.nextInt();
        System.out.print("please enter number 2 : ");
        int num2 = n.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of two number inputs is : " + sum);
    }
}