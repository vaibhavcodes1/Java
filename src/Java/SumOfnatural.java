package Java;

import java.util.Scanner;
public class SumOfnatural {
   public static int sumof(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int n = sc.nextInt();
        System.out.println(sumof(n));
    }
}
