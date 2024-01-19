package course_1.hw_7_cycle;

public class Task1 {

    public static void main(String[] args) {
        int deposit = 15000;
        int savings = 0;
        int month = 0;
        while (savings <= 2459000) {
            savings = savings + savings/100;
            savings = deposit + savings;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
    }
}
