import java.util.Scanner;

public class Search2DArr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D search");
        int[][] numArr = ArrayUtility.input2DArray();

        System.out.println("Now enter the number you want to search:");
        int num = input.nextInt();

        boolean isfound = search(numArr,num);
        if(isfound){
            System.out.println("your number was found");
        } else {
            System.out.println("Number was not found");
        }

    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0 ;
            while (j < i){
                if (numArr[i][j] == num){
                    return true ;
                }
                    j++;
            }
                i++;
        }
        return false;
    }


}