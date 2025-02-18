import java.util.Scanner;

public class PasswordCheckerRettet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password.");
        String input = scanner.nextLine();
        if (isValidPassword(input)) {
            System.out.println("Password accepted.");
        } else System.out.println("Invalid password!");
    }
    public static boolean isValidPassword(String password) {
        if (password.contains("qwerty") || password.contains("secret") || password.length() <8) {
            return false; }
        for (int i = 0; i < password.length(); i++) {
            char iChar = password.charAt(i);
            boolean isValidPassword = isCharAlphaNumeric(iChar);
            if (!isValidPassword) {
                return false; }
        } return true;
    }
    public static boolean isCharAlphaNumeric(char ch) {
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }
}