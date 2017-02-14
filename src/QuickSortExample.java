/**
 * Created by shekhars on 2/14/2017.
 */
public class QuickSortExample {

    public static void main(String[] args) {
        int[] array = {54, 26, 93, 17, 77, 31, 44, 55, 20, 26};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = division(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int division(int[] array, int start, int end) {
        int pivot = array[start];
        int left = start + 1;
        int right = end;
        while (left <= right) {
            while (left <= right && array[left] <= pivot) {
                left = left + 1;
            }
            while (left <= right && array[right] >= pivot) {
                right = right - 1;
            }

            if (left > right) {
                break;
            } else {
                swap(array, left, right);
            }
        }
        swap(array, start, right);
        return right;
    }

    private static void swap(int[] array, int start, int right) {
        int temp = array[start];
        array[start] = array[right];
        array[right] = temp;
    }
}
