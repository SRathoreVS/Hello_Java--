import java.util.Scanner;

public class FahrenToCel {
    public static void main(String[] args) {
        //Fahrenheit to celsius
        Scanner fahrenheit = new Scanner(System.in);
        System.out.print("enter the Fahrenheit Temperature: ");
        double fah = fahrenheit.nextDouble();
        double celsius = (fah - 32) * ((double) 5 /9);
        System.out.println("today's temperature is "+ celsius + "degree ");
    }
}