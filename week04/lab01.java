 package week04;

 class lab01 {

    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 4 },
                { 5, 7, 4 },
                { 5, 7, 1 },
        };
        int[][] arr2 = {
                { 7, 2, 5 },
                { 5, 7, 2 },
                { 5, 2, 4 },
        };

        int[][] res = addMatrix(arr1,arr2 );


        printMatrix(res);


    }
    
    
    static void printMatrix ( int [][] arr){
        for (int i = 0 ; i < 3 ; i++){  
            for (int j = 0 ; j < 3 ; j++){
                System.out.print( arr [i][j] + "\t" );
            }
            System.out.println( );
        }
        
    }
    
    static int [][] addMatrix(int[][] arr1, int[][] arr2) {
        int res[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return res;
    }
    
}
