package course_1.hw_4_if_operator;

public class Task7 {

    public static void main(String[] args) {
        int one = 2;
        int two = 7;
        int three = 1;
        if (one < three && two < three) {
            System.out.println(three);
        } else if (three < two && one < two) {
            System.out.println(two);
        } else {
            System.out.println(one);
        }
    }
}
