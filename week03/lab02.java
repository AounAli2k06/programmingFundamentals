package week02;

public class lab02 {
    public static void main(String[] args) {
        
        int [][] m = {
            {1,2,3},
            {2,4,5},
            {4,6,7} 
        };
    
        for(int i = 0 ; i < 3 ; i++){
            
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(m[j][i] + " ");
            }
            System.out.println( );
        }
    }
    
}
