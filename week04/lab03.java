package week04;

public class lab03 {
    public static void main(String[] args) {

    }

    static void max(int a, int b, int c) {
        if (a > b && a > c ) {
            System.out.println("a is greater") ;
        }
        else if (b > a && b > c) {
            System.out.println( "b is greater");        
        }
        else if (c > a && c > b) {
            System.out.println( "b is greater");        
        }
    }
    
    static void max(double a, double b) {
        if (a > b ) {
            System.out.println("a is greater") ;
        }
        else if (b > a ) {
            System.out.println( "b is greater");        
        }
    }

    static void max(int a, int b) {
        if (a > b ) {
            System.out.println("a is greater") ;
        }
        else if (b > a ) {
            System.out.println( "b is greater");        
        }
    }
    
    static void max(double a, double b, double c) {
        if (a > b && a > c ) {
            System.out.println("a is greater") ;
        }
        else if (b > a && b > c) {
            System.out.println( "b is greater");        
        }
        else if (c > a && c > b) {
            System.out.println( "b is greater");        
        }
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static double sub(double a, double b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static double divide(double a, double b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double mul(double a, double b) {
        return a + b;
    }
}
