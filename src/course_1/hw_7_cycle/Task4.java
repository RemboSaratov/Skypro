package course_1.hw_7_cycle;

public class Task4 {

    public static void main(String[] args) {
        double targetSavings = 12000000;
        double deposit = 15000;
        double currentAmount = deposit;
        int month = 0;
        while (currentAmount < targetSavings) {
            month++;
            currentAmount *= 1.07;
            System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", month, currentAmount);
        }
    }
}

