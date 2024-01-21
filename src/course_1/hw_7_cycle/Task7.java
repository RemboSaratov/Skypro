package course_1.hw_7_cycle;

public class Task7 {

    public static void main(String[] args) {
        int firstFriday = 4;
        int daysInMonth = 31;
        for (int i = firstFriday; i <= daysInMonth; i += 7) {
            System.out.println("Сегодня пятница " + i + " число. Необходимо подготовить отчет");
        }
    }
}
