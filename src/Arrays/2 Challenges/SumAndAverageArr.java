public class SumAndAverageArr {

    public static void main(String[] args) {
        int average = sumAvg(new int[]{49, 67, 88, 90, 85});
        System.out.println("Average is : " + average);
    }

    public static int sumAvg(int[] arr){
        //traverse
        int i = 0;
        int sum = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        return (sum/arr.length);

    }
}