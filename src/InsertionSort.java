import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("\nArray after sorting");
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
};
