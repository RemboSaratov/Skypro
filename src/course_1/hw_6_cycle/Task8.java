package course_1.hw_6_cycle;

public class Task8 {

    public static void main(String[] args) {
        int savings = 29000;
        int savingsForyear = 0;
        for (int i = 0; i < 12; i++) {
            savingsForyear = savingsForyear + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsForyear
                   + " рублей");// отработка переноса строки
        }
        System.out.println("Накопления за год составили " + savingsForyear + " рублей");
    }
}
