public class TwoDArray {

    public static void main(String[] args) {
        int[][] myArray = new int[3][4];
        int[][] inArray = {{1,2,3,4},{5,6,7,8},{12,33,32},{12,23}};

        System.out.println(inArray[2][1]);

        int i = 0;
        while (i < inArray.length){
            int j = 0;
            while (j < inArray[i].length){
                System.out.print(inArray[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}