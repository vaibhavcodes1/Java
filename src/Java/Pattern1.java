package Java;

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        String str = "Choose: \n1.Addition" +
                "\n2.Subtraction" +
                "\n3.Multiplication" +
                "\n4.Division" +
                "\n5.Modulas";
        System.out.println(str);
//        int n = input.nextInt();
        String strn = input.next();
        switch (strn) {
            case "Addition"-> System.out.println("Addition is:" + (num1 + num2));

            case "Subtract"-> System.out.println("Subtraction is:" + (num1 - num2));

            case "Multiplication"-> System.out.println("Multiplication is:" + (num1 * num2));

            default-> System.out.println("Try Again");
        }
    }
}


//        if(n==1){
//            System.out.println("Addition is:"+(num1+num2));
//        }
//        else if(n==2){
//            System.out.println("Subtraction is:"+(num1-num2));
//        }
//        else if(n==3){
//            System.out.println("Multi is:"+(num1*num2));
//        }
//        else if(n==4){
//            System.out.println("Division is:"+(num1/num2));
//        }
//        else{
//            System.out.println("Error");
//        }

