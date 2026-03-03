import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }

//        int num2 = 500;
//         while (num2 >= 200){
//             System.out.println(num2);
//             num2--;
//         }

        Scanner userInp = new Scanner(System.in);
        System.out.print("enter the num");
        int i = 0;
        while(i < 5){
            int inp = userInp.nextInt();
            System.out.println(inp);
            i++;
        }
    }
}