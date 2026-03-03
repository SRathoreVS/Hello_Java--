import java.util.Scanner;

public class LogicalOps {
    public static void main(String[] args) {
        //        age < 5 - 75% | age > 60 -25% | female - 50%

        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = userAge.nextInt();

        System.out.print("Are you a female ? (true/false)");
        boolean isFemale = userAge.nextBoolean();

        if(age < 5){
            System.out.println("you got 75% discount");
        } else if (isFemale) {
            System.out.println("you got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount");
        } else {
            System.out.println("you got no discount");
        }

    }
}