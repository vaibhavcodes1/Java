package Java;

public class Binarysearch1 {
    //Recursive Binary Search
    public static int binarysearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarysearch(arr,mid + 1,high, target);
        } else {
            return binarysearch(arr, low,mid - 1, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(binarysearch(arr, 0, arr.length - 1, 70));
    }
}
