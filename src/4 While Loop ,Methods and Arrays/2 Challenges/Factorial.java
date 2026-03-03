import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

       int result =  fact(num);
        System.out.println("Factorial is : " + result);
    }

    public static int fact(int num){
        int i = 1;
        int total = 1;
        while(i <= num) {
            total *= i ;
            i++;
        }
        return total;
    }
}