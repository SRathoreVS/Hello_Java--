public class SumOfAllOdd {
    public static void main(String[] args) {
        int result  = sumAllOdd(5);
        System.out.println(result);

        int res2 = altOddSumMethod(12);
        System.out.println(res2);
    }

    public static int sumAllOdd(int n){
        int i = 1;
        int sum = 0;
        while (i <= n){
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static int altOddSumMethod(int a){
        int i = 1;
        int sum = 0;

        while (i <= a){
            sum += i;
            i+=2;
        }
        return sum;
    }
}