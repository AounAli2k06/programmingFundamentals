package week03;

public class lab03 {
    public static void main(String[] args) {

        int[][] m1 = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 4, 6, 7 }
        };
        int[][] m2 = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 4, 6, 7 }
        };
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = m1[i][j] + m2 [i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(m[i][j] + "\t");
                }
                System.out.print("\n");
        }
    }
}
