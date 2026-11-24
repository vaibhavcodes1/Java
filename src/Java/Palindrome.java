import java.util.Scanner;

//USING TWO POINTER APPROACH (MOST EFFICIENT)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String:");
    String palindrome = sc.nextLine();
    String cleaned = palindrome.toLowerCase().replace(" ", "");

    int left = 0;
    int right = cleaned.length() - 1;
    boolean isPalindrome = true;

    while (left < right) {
        if (cleaned.charAt(left) != cleaned.charAt(right)) {
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }

    if (isPalindrome) {
        System.out.println("Its a palindrome");
    } else {
        System.out.println("Its not a palindrome");
    }
    sc.close();
}

