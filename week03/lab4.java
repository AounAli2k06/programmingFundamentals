package week04;

public class lab4 {
    public static void main(String[] args) {
        double marks[] = { 55, 52, 41, 51, 65 };
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double avg = sum / marks.length;
        System.out.println(avg);
    }
}
