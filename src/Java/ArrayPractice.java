package Java;

import java.util.Scanner;
//Number guessing game
public class ArrayPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int number=(int)(Math.random()*100);
System.out.println("Enter a number betn 1 to 100:");
int k= 5;
System.out.println("you have"+k+"attempts");

for(int i=0;i<k;i++) {
    System.out.println("Enter ur guess:");
    int num=sc.nextInt();
    if (num == number) {
        System.out.println("Right");
        sc.close();
    }
    else if (num < number) {
        System.out.println("Guess Higher");
    }
    else{
        System.out.println("Guess lower");
    }
}

System.out.println("Attempts over The Random number is:"+number);

    }
}