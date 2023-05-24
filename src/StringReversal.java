import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= scanner.nextLine();
        scanner.close();

        StringBuilder reversedString = new StringBuilder();

        for (int i=input.length()- 1; i>=0; i--) {
            reversedString.append(input.charAt(i));
        }
        System.out.println("Reversed string: " + reversedString.toString());
    }
}