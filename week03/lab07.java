package week07;

public class lab07 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 5, 9 };
        int target = 7;
        boolean found = false;
        int ind = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                ind = i;
            }
        }

        if (found) {
            System.out.println("found " + target + " at index " + ind);
        } else {
            System.out.println("not found ");
        }
    }
}
