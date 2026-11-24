package Java;

import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element:");
        int n = sc.nextInt();
        System.out.println("Enter"+n+"arrays");
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        System.out.println("your array"+java.util.Arrays.toString(num));

    }
}
