
package homework.work2;

public class task1 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 8, 1};
        int targetSum = 10;

        findSum(arr, targetSum);
    }

    public static void findSum(int[] arr, int targetSum ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Найдена сумма, индексы элементов: " + i + " , " + j );
                    break;
                }
            }
        }
    }
}
