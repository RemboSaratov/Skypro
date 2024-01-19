package course_1.hw_7_cycle;

public class Task2 {

    public static void main(String[] args) {
        int namber = 0;
        while (namber < 10) { // пока переменная меньше 10 но выводит включая 10 ?????
            namber = namber + 1;
            System.out.print(namber + " ");
        }
        System.out.println();
        for (namber = 10; namber > 0; namber--) {
            System.out.print(namber + " "); // единнственный способ создания пробела ??????
        }
    }
}
// ???????? задать вопрос на разборе
