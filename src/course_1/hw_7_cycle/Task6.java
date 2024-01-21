package course_1.hw_7_cycle;

public class Task6 {

    public static void main(String[] args) {
        double deposit = 15000;
        int yearsToTargetMoney = 9;
        int monthToTargetMoney = yearsToTargetMoney * 12;
        for (int i = 1; i <= monthToTargetMoney; i++) {
            deposit *= 1.07;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", i, deposit);
            }
        }
    }
}
