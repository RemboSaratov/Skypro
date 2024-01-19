package course_1.hw_7_cycle;

public class Task4 {

    public static void main(String[] args) {
        int allSavings = 0;
        int deposit = 15000;
        int month = 0;
        while (allSavings < 12000000) { // не понял как сделать чтобы остановился до 12000000
            allSavings = allSavings + deposit;
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            System.out.println(month + " " + allSavings);
        }
    }
}

