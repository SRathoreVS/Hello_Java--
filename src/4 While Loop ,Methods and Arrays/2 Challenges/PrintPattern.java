import java.util.Scanner;

public class PrintPattern {

    public static void main(String[] args) {
        Scanner lineInput = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int num = lineInput.nextInt();
        System.out.println("1st pattern");
        int print1 = patterns(num);
        System.out.println("2nd pattern");
        int print2 = patterns2(num);
        System.out.println("3rd pattern");
        int print3 = patterns3(num);
    }

    public static int patterns(int num) {
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        return num;
    }

    public static int patterns2(int num) {
        int i = num;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        return num;
    }

    public static int patterns3(int num){
        int i = 1;

        while(i <= num){

            // Print spaces
            int space = 1;
            while(space <= num - i){
                System.out.print(" ");
                space++;
            }

            // Print stars
            int star = 1;
            while(star <= i){
                System.out.print("*");
                star++;
            }

            System.out.println();
            i++;
        }
        return num;
    }
}