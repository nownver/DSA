package cheatsheet;

public class Sort {
    public static void main(String[] arg) {
        int[] array = new int[] { 2, 5, 4, 1, 3, 8, 6, 7 };

        bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);

        // quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int a, int b) {
        if (a != b) {
            arr[a] = arr[a] ^ arr[b];
            arr[b] = arr[a] ^ arr[b];
            arr[a] = arr[a] ^ arr[b];
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j])
                    swap(arr, j - 1, j);
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            if (minIdx != i)
                swap(arr, i, minIdx);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start)
            return; // base case;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    public static void mergesort(int arr[]) {
        int len = arr.length;
        if (len <= 1)
            return;
        int[] right = new int[len - len / 2];
        int[] left = new int[len / 2];
        int righti = 0;
        int lefti = 0;

        for (int i = 0; i < len; i++) {
            if (i < len / 2)
                left[lefti++] = arr[i];
            else
                right[righti++] = arr[i];
        }

        mergesort(left);
        mergesort(right);
        mergehelper(arr, left, right);
    }

    public static void mergehelper(int arr[], int leftarr[], int rightarr[]) {
        int i = 0;
        int ri = 0;
        int li = 0;

        int lenl = leftarr.length;
        int lenr = rightarr.length;
        while (ri < lenr && li < lenl) {
            if (leftarr[li] <= rightarr[ri]) {
                arr[i++] = leftarr[li++];
            } else {
                arr[i++] = rightarr[ri++];
            }
        }
        while (ri < lenr) {
            arr[i++] = rightarr[ri++];
        }
        while (li < lenl) {
            arr[i++] = leftarr[li++];
        }
    }
}
