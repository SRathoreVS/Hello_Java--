import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        table();
    }

    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please the enter the number : ");
        int num = input.nextInt();
        int i = 1;

        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;

        }
    }
}