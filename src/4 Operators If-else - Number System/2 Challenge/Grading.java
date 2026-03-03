import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner userMarks = new Scanner(System.in);
        System.out.print(" enter the English Mark : ");
        double enMark = userMarks.nextDouble();
        System.out.print(" enter the Math Mark : ");
        double mathMark = userMarks.nextDouble();
        System.out.print(" enter the Science Mark : ");
        double scienceMark = userMarks.nextDouble();
        System.out.print(" enter the Hindi Mark : ");
        double hindiMark = userMarks.nextDouble();

        double percentage = ((enMark + mathMark + scienceMark + hindiMark)/400) * 100;

        if (percentage >= 90){
            System.out.println(" you got A");
        } else if (percentage >= 75) {
            System.out.println(" you got B");
        } else if (percentage >= 60){
            System.out.println(" you got C");
        } else if (percentage >= 30) {
            System.out.println(" you got D");
        }else {
            System.out.println(" you failed ");
        }


    }
}