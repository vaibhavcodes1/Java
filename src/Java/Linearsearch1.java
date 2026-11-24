package Java;

public class Linearsearch1 {
    static int linearsearch(int arr[],int n,int x,int count){
        for (int i = 0; i < n; i++) {
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args){
           int arr[] = {10,20,30,40,50,30,30};
           int n = arr.length;
           int x = 30;
           int count = 0;
           int search = linearsearch(arr,n,x,count);
           if(search==-1){
               System.out.println("Not Found");
           }else{
               System.out.println("Found at index:"+search);
           }
        }
    }
