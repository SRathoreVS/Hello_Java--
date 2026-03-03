public class TypeConversion {
    public static void main(String[] args) {

        int myInt = (int) 5.0f;
        System.out.println(myInt);//5

        int myInt2 = (int) 5.9f;
        System.out.println(myInt2);//5
    }
}