public class IncDec {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(y);
        System.out.println(z);

        int a = 5;
        a += 1;
        System.out.println(a);
//        a++;
//        System.out.println(a); //7
//        ++a;
//        System.out.println(a); //8

        int p = 1;
        System.out.println(p++);
        System.out.println(++p);
    }
}