import java.util.Scanner;

public class AirthChallenge {
    public static void main(String[] args) {
        //takes two num and shows result of all airthmatic operations +-*/%
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = userInput.nextInt();
        System.out.print("Enter num 2: ");
        int b = userInput.nextInt();
        int add = a+b;
        int mul = a*b;
        int div = a/b;
        int sub = a-b;
        int mod = a%b;
        int result = a/b*a+b-a;
        System.out.println("The result is : " + result);
        System.out.println("Addition : " + add);
        System.out.println("Sub : " + sub);
        System.out.println("divide : " + div);
        System.out.println("Multiplication : " + mul);
        System.out.println("Modulas : "+ mod);
    }
}