package week06;

public class lab06 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 44, 22 };
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("even: " + even + "\n" + "odd: " + odd);
    }
}
