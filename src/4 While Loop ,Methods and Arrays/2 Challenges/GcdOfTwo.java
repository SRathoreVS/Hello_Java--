public class GcdOfTwo {
    public static void main(String[] args) {
        int gcdRes = gcd(12, 20);
        System.out.println("gcd of two numbers is : " + gcdRes);
    }

    public static int gcd(int n1,int n2){
        int i = Math.min(n1, n2);
        while (true){
            if(n1 % i == 0 && n2 % i == 0) {
                return i ;
            }
            i--;
        }
    }
}