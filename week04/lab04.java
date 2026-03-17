package week04;
import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int num = sc.nextInt( ); 
        isPrime(num );
    }

    static void isPrime ( int num) {
        if ( num % 2 == 0){
            System.out.println( num + " is a prime number");
        }
        else{
            System.out.println( num + " is not a prime number");
            
        }
    }
}
