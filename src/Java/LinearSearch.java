package Java;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 9, 4, 6, 4, 1};
        int n = arr.length;
        int target = 4;
        int count = 0;
        for (int i=0; i<n;i++){
            if(arr[i]==target){
               System.out.println("Found at index:"+i);
               count++;
            }
        }
        System.out.println("Total occurence="+count);
    }
}