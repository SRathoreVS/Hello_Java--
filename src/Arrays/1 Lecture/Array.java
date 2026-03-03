public class Array {

    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 67;
//        myArr[1] = 58;
//        myArr[2] = 98;
//        myArr[3] = 89;
//        myArr[4] = 79;

        int[] myArr = {67,58,98,89,79};
        int index = 2;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[index]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
//        System.out.println(myArr[5]); arrayIndexOutOfBounds
        System.out.println("---------------");

        System.out.println("Array Traversal");
        int i = 0;
        while (i < myArr.length){
            System.out.println(myArr[i]);
            i++;
        }

        String[] arr = new String[4];
        arr[0] = "My String";

        String[] newStrArr = {"first","second","third"};
        System.out.println(newStrArr.length);




    }
}