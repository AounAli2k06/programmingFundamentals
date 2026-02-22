package week02;
import java.util.Scanner;

public class StringReversalPrepend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();

        String r = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            r = c + r;
        }

        System.out.println("Reversed String: " + r);
    }

}