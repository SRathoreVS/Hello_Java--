public class SumOfDigi {
    public static void main(String[] args) {
         int finalSum = digiSum(23456);
        System.out.println(finalSum);
    }

    public static int digiSum(int n){
        int total = 0;
        while(n > 0){
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}