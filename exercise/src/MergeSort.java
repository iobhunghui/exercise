public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }
        display(arr);
        System.out.println();
        display(arr);
        int[] arr2 = new int[]{31, 2, 8, 1, 8, 24, 7, 10, 99, 0};
        display(arr2);
    }

    public static void MergeSort(int[] arr) {

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
