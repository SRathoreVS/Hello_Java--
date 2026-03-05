import java.util.Scanner;

public class SumAvg2DArr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D SumAvg");
        int[][] numArr = ArrayUtility.input2DArray();

        int average = sumAvg(numArr);
        System.out.println(average);

    }

    public static int sumAvg(int[][] arr){
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                sum += arr[i][j];
                count++;
                j++;
            }
            i++;
        }
        System.out.println(sum);
        return sum/ count;
    }
}