import java.util.Scanner;

public class ShortHandOP {
    public static void main(String[] args) {
        int a = 5;
        Scanner userInput = new Scanner(System.in);
        int a1 = userInput.nextInt();
        a += a1;
        System.out.println(a);
        int a2 = userInput.nextInt();
        a += a2;
        System.out.println(a);
        int a3 = userInput.nextInt();
        a += a3;
        System.out.println(a);
    }
}