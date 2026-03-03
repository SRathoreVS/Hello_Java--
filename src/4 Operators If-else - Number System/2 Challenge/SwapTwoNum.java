import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int a = value.nextInt();
        System.out.print("Enter the 2st Number : ");
        int b = value.nextInt();
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping is done....");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
    }
}