package Hw_4_условный_оператор;

public class Task5 {

    public static void main(String[] args) {
        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататся на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататся на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататся на аттракционе ,без сопровождения взрослого");
        }
    }
}
