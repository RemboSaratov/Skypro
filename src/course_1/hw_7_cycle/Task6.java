package course_1.hw_7_cycle;

public class Task6 {

    public static void main(String[] args) {
        int allSavings = 0;
        int deposit = 15000;
        for (int i = 0; i < 109; i++) {
            allSavings = allSavings + deposit;
            deposit = deposit + deposit / 100 * 7;
            if (i % 6 == 0) {
                System.out.println(i + " " + allSavings);
            }
        }
    }
}
