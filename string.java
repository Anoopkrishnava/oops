import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        input = input.toUpperCase();
        System.out.println("Uppercase: " + input);
        input = input.toLowerCase();
        System.out.println("Lowercase: " + input);
        int length = input.length();
        System.out.println("Length: " + length);
        input = input.trim();
        System.out.println("Trimmed: '" + input + "'");
        System.out.print("Enter a substring to check: ");
        String substring = scanner.nextLine();
        boolean contains = input.contains(substring);
        System.out.println("Contains substring '" + substring + "': " + contains);
        System.out.print("Enter a string to concatenate: ");
        String concat = scanner.nextLine();
        input = input + " " + concat;
        System.out.println("Concatenated string: " + input);
        scanner.close();
    }
    
}
