package course_1.hw_6_cycle;

public class Task8 {

    public static void main(String[] args) {
        int savings = 29000;
        int savingsForyear = 0;
        int month = 0;
        for (int i = 0; i < 12; i++) {
            savingsForyear = savingsForyear + savings;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savingsForyear
                   + " рублей");
        }
    }
}
