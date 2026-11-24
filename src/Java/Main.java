package Java;

//Binary_Search
class main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 80;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
            }
            if (arr[mid] < target) {
                start = mid + 1;
                if (start == target)
                    System.out.println("Found at " + start);

            } else {
                end = mid - 1;
                if (end == target) {
                    System.out.println("Found at" + end);
                }
            }
        }
    }
}