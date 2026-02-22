package week02;
import java.util.Scanner;

public class addUserInputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        do {
            System.out.println("Enter a number to add or press 0 to end:");
            n = sc.nextInt();
            sum += n;
        } while (n != 0);

        System.out.println("The sum is: " + sum);
    }
}
