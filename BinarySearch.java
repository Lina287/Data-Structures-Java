import java.util.*;

public class BinarySearch {

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Element fount at index: " + mid);
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        binarysearch(arr, target);
    }
}