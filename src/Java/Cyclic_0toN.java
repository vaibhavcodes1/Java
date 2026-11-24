package Java;

class Cyclic_0toN {
    public static void main(String[] args) {

        int[] arr = {0, 2, 4, 1};

        int i = 0;

        // Cyclic Sort
        while (i < arr.length) {

            int correct = arr[i];

            if (arr[i]<arr.length && arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Find missing number
        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index) {
                System.out.println("Missing number: " + index);
                break;
            }
        }
    }
}
