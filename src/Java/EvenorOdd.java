import java.util.Scanner;

public static boolean Checkevenorodd(int n) {
    return n % 2 == 0;
}

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a integer:");
    int n = sc.nextInt();

    if (Checkevenorodd(n)) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }
}
