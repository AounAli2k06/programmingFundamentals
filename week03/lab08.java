package week08;

public class lab08 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0 , j = arr.length - 1 ; i < j ; i++,j--) {
            if (i == j) {
                break;
            } else {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
            
            
        }
        System.out.print("\nafter: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");

        }
    }
}

 