package Java;

public class Cyclic_1toN {
    public static void main(String[] args){
        int[] arr = {1,3,5,4};
        int n = arr.length;
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>=1 && arr[i]<n && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int index=0;index<n;index++){
            if(arr[index]!=index+1){
                System.out.println(index+1);
            }
        }
    }
}
