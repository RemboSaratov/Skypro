package course_1.hw_8_massive_2;

public class Task2 {
    public static void main(String[] args) {
        int[] spending = {210, 3, 341, 5, 2};
        int maxSpending = -1;
        int minSpending = spending[0];
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] > maxSpending) {
                maxSpending = spending[i];
            }
        }
        System.out.println(maxSpending);
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] < spending[i] + 1 && spending[i] <= minSpending ) {
                minSpending = spending[i];

            }
        }
        System.out.println(minSpending);
    }
}
