import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1 = userInput.nextInt();

        System.out.print("Enter Number 2: ");
        int n2 = userInput.nextInt();

        System.out.print("Enter Number 3: ");
        int n3 = userInput.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the greatest of all three.");
        }
        else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the greatest of all three.");
        }
        else {
            System.out.println(n3 + " is the greatest of all three.");
        }
    }
}