package Java;

class Binarysearch {
    //Iterative Binary Search
    public static int binarysearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 100;
        binarysearch(arr,target);
        System.out.println("Element found at index: "+binarysearch(arr,target));
    }
}