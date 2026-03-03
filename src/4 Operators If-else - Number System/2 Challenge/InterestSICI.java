import java.util.Scanner;

public class InterestSICI {
    public static void main(String[] args) {
        //SIMPLE INTEREST
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Principal Amount : ");
        double principal = input.nextDouble();
        System.out.print("Please enter the time in years : ");
        double time = input.nextDouble();
        System.out.print("Please enter the Rate of Interest : ");
        double rate = input.nextDouble();

        double simple = (principal*rate*time)/100;
        System.out.println("Simple Interest : "+ simple);

        //Compound

        double compound = principal*Math.pow((1+(rate/100)),time);
        System.out.println("Compound Interest : " + compound);
    }
}