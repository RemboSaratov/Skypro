package course_1.hw_7_cycle;

public class Task8 {

    public static void main(String[] args) {
        int ourYear = 2024;
        int cometArrival = 0;
        int cometArrivalRate = 79;
        int beforeNawYear = ourYear - 200;
        int afterNawYear = ourYear + 100;
        while (cometArrival < afterNawYear) {
            if (cometArrival > beforeNawYear) {
                System.out.println(cometArrival);
            }
            cometArrival += cometArrivalRate;
        }
    }
}


