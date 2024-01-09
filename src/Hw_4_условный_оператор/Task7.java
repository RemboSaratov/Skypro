package Hw_4_условный_оператор;

public class Task7 {

    public static void main(String[] args) {
        int one = 2;
        int two = 7;
        int three = 1;
        if (one < three && two < three) {
            System.out.println(three);
        } else if (three < two && one < two) {
            System.out.println(two);
        } else if (two < one && three < one) {
            System.out.println(one);
        }
    }
}
