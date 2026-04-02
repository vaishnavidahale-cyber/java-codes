import java.util.Scanner;

public class UserUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = input.toUpperCase();

        System.out.println("Uppercase: " + result);
    }
}