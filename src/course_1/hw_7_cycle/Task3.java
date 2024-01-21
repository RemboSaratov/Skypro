package course_1.hw_7_cycle;

public class Task3 {

    public static void main(String[] args) {
        int yPopulation = 12000000;
        int birth = 17;
        int death = 8;
        // не стал вводить переменную rate = 1000 т.к. в условии требуют 3 переменные
        int year = 0;
        while (year < 10) {
            yPopulation = yPopulation + birth * yPopulation/1000 - death * yPopulation/1000; // большие вопросы т.к. гуманитарий
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + yPopulation);
        }
    }
}
