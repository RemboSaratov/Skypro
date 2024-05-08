package course_1.hw_8_massive;

public class Task2 {
    //для коммита
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++){
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        //
        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(weights[i] + ", ");
        }
        System.out.println();
        //
        double[] box = new double[4];
        box[0] = 1.1;
        box[1] = 5.98;
        box[2] = 9.8787;
        box[3] = 45.876978;
        for (double element : box)
        System.out.print(element + ", ");
    }
}
