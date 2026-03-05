public class MergeTwoSortArr {

    public static void main(String[] args) {
        System.out.println("Welcome to merging Sorted arrays ");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] mergedArr = mergeArr(arr1,arr2);
        System.out.println("your merged array is : ");
        ArrayUtility.displayArr(mergedArr);


    }

    public static int[] mergeArr(int[] arr1, int[] arr2){

        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        return newArr;
    }


}