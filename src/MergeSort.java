import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int first, int mid, int last) {
        int sizeOfLeftPart = mid - first + 1;
        int sizeOfRightPart = last - mid;

        int[] tempLeftArray = new int[sizeOfLeftPart];
        int[] tempRightArray = new int[sizeOfRightPart];

        for (int i = 0; i < sizeOfLeftPart; i++) {
            tempLeftArray[i] = arr[first + i];
        }
        for (int i = 0; i < sizeOfRightPart; i++) {
            tempRightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = first;
        while (i < sizeOfLeftPart && j < sizeOfRightPart) {
            if (tempLeftArray[i] < tempRightArray[j]) {
                arr[k] = tempLeftArray[i];
                i++;
            } else {
                arr[k] = tempRightArray[j];
                j++;
            }
            k++;
        }
        while (i < sizeOfLeftPart) {
            arr[k] = tempLeftArray[i];
            i++;
            k++;
        }
        while (j < sizeOfRightPart) {
            arr[k] = tempRightArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int f, int l) {
        if (f < l) {
            int mid = (f + l) / 2;
            mergeSort(arr, f, mid);
            mergeSort(arr, mid + 1, l);
            merge(arr, f, mid, l);
        }
    }

    public static void main(String[] args) {
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
        mergeSort(arr, 0, n - 1);
        System.out.println("\nArray after sorting");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
