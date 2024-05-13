package course_1.hw_8_massive_2;

public class Task1 {
    public static void main(String[] args) {
        int[] salary = {5, 6, 13, 14, 34};
        int sum = 0;
        for (int index = 0; index < salary.length; index++) {
            sum = sum + salary[index];
        }
        System.out.println(sum);
    }
}

