import java.util.Scanner;

public  class CalcFloatChall {
    public static void main(String[] args) {
        Scanner floatNum = new Scanner(System.in);
        System.out.print("Enter the first Decimal Num: " );
        float firstNum = floatNum.nextFloat();
        System.out.print("Enter the second Decimal Num: " );
        float secondNum = floatNum.nextFloat();
        float product = firstNum * secondNum;
        System.out.println("the product of numbers is : " + product);
    }
}