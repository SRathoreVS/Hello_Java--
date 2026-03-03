import java.util.Scanner;

public class RelationalOp {
    public static void main(String[] args) {
        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = userAge.nextInt();
        //checks
        if(age >= 18) {
            System.out.println("You are eligible for DL test");
        } else {
            System.out.println("you are below 18 years not eligible for DL test");
        }



    }
}