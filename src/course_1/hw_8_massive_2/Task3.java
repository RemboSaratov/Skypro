package course_1.hw_8_massive_2;

public class Task3 {
    public static void main(String[] args) {
        // НЕ понял условие. Что значат эти 5 элементов?
        int[] spending = {90, 5, 93, 91, 4,};
        int sum = 0;
        int week = 4;
        for (int i = 0; i < spending.length; i++) {
            sum += spending[i];
        }
        System.out.println((double) sum/week);
    }
}
