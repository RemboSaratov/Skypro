package course_1.hw_8_massive;

import java.util.Arrays;
//для коммита
public class Task4 {
// для коммита
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
            System.out.print(number[i] + " ");
        }
    }
}
