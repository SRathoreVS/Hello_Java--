import java.util.Scanner;

public class LcmOfTwo {
    public static void main(String[] args) {
        int lcmRes = lcm(12, 15);
        System.out.println("Lcm of two numbers is : " + lcmRes);
    }

    public static int lcm(int n1,int n2){
        int i = Math.max(n1, n2);
        while (true){
            if(i % n1 == 0 && i % n2 == 0) {
                return i ;
            }
            i++;
        }
    }
}