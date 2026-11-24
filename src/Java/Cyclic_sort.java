package Java;

import java.util.Arrays;
public class Cyclic_sort {
    public static void main(String[] args) {

        int[] arr = {4,1,2,9, 5, 6, 7, 8,3,10};
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
