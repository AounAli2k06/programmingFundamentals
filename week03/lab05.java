package week05;

public class lab05 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 44, 22 };
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    largest = arr[j];
                }
            }

        }
        System.out.println("the largest num is: " + largest);
    }
}
