package week02;
import java.util.Scanner;

public class StringReversalAppend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();

        String r = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            r = r + c;
        }

        System.out.println("Reversed String: " + r);
    }
}
