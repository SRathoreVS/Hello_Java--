import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int numb = input.nextInt();
        fib(numb);
    }

    public static void fib(int num){
        if(num < 0){
            return;
        }
        System.out.print("0 ");
        if (num == 0) {
            return;
        }
        System.out.print("1 ");
        int i = 0;
        int j = 1;
        while (i+j <= num){
            int k = i + j;
            System.out.print(k + "  ");
            i = j;
            j = k;
        }
    }

}