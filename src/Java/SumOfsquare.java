package Java;

import java.util.Scanner;
public class SumOfsquare {
    public static int sumofsquare(int n){
        return (n*(n+1)*(2*n+1))/6;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(sumofsquare(n));
    }

}
