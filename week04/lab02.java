package week04;

public class lab02 {
    public static void main(String[] args) {
        printTable(2);
    }
    static void printTable(int num) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
            
        }
    }
}