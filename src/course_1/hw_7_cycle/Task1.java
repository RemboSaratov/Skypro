package course_1.hw_7_cycle;

public class Task1 {

    public static void main(String[] args) {
        int deposit = 15000;
        int savings = 0;
        int month = 0;
        while (savings <= 2459000) {
            savings = savings + savings/100; // решение с учетом накопления 1% от общей суммы
            savings = deposit + savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
    }
}
