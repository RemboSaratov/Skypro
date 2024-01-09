package Hw_4_условный_оператор;

public class Task1 {

    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний" );
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

}
