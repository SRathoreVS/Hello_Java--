import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        System.out.print("Enter a Number to check Armstrong : ");
        int numb = newInput.nextInt();
        boolean isArmstrong = armstrongCheck(numb);
        if (isArmstrong){
            System.out.println("your number is armstrong");
        } else {
            System.out.println("your number is notarmstrong");
        }
    }
    public static boolean armstrongCheck(int num){

        int digits = noOfDigits(num);
        int numCopy  = num;
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num %10;
            num /= 10;
            finalNumber += pow(lastDigit,digits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int n1,int n2){
        int result = n1;
        int i = 1   ;
        while (i<n2){
            result *= n1;
            i++;
        }
        return result;

    }

    public static int noOfDigits(int n){
        int digi = 0;

        while (n > 0){
            digi++;
            n /=10;
        }
        return digi;
    }
}