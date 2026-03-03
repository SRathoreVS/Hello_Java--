import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        boolean primeRes = prime(num);
        if(primeRes){
            System.out.println("Your Number is Prime");
        } else {
            System.out.println("Your Number is Not a Prime");
        }

    }

    public static boolean prime(int num){

        int i = 2 ;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}