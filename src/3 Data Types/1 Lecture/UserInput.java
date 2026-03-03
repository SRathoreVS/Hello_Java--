import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please Enter your name : ");
        String name = myInput.nextLine();
        System.out.println("Good Morning : "+ name);

        System.out.println(name + " ,Also tell me your age");
        int age = myInput.nextInt();
        System.out.println("your age is :" + age);

        System.out.println(name + " ,Please tell me your cgpa");
        double cgpa  = myInput.nextDouble();
        System.out.println("my cgpa is : "+ cgpa);
    }
}