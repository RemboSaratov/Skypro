package course_2.hw_2;

public class PrintClass {

    public void printCalcCogtevran(Cogtevran student1, Cogtevran student2) {
        int sumFirst = student1.getMind() + student1.getCreativity() + student1.getWisdom()
                + student1.getWit();
        int sumSecond = student2.getMind() + student2.getCreativity() + student2.getWisdom()
                + student2.getWit();
        if (sumFirst > sumSecond) {
            System.out.println("На факультета Когтеврана " + student1.getName() + " талантливее чем " + student2.getName());
        }
        else if (sumFirst < sumSecond) {
            System.out.println("На факультета Когтеврана " + student2.getName() + " талантливее чем " + student1.getName());
        } else {
            System.out.println("Силы равны");
        }
        System.out.println();
    }

    public void printCalcGrifindors(Grifindor student1, Grifindor student2) {
        int sumFirst = student1.getNobility() + student1.getCourage() + student1.getHonor();
        int sumSecond = student2.getNobility() + student2.getCourage() + student2.getHonor();
        if (sumFirst > sumSecond) {
            System.out.println("На факультета Грифиндора " + student1.getName() + " талантливее чем " + student2.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println("На факультета Грифиндора " + student2.getName() + " талантливее чем " + student1.getName());
        } else {
            System.out.println("Силы равны");
        }
        System.out.println();
    }

    public void printCalcPuffendies(Puffendy student1, Puffendy student2) {
        int sumFirst = student1.getDiligence() + student1.getHonesty() + student1.getLoyalty();
        int sumSecond = student2.getDiligence() + student2.getHonesty() + student2.getLoyalty();
        if (sumFirst > sumSecond) {
            System.out.println("На факультета Пуфендуя " + student1.getName() + " талантливее чем " + student2.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println("На факультета Пуфендуя " + student2.getName() + " талантливее чем " + student1.getName());
        } else {
            System.out.println("Силы равны");
        }
        System.out.println();
    }

    public void printCalcSlitherins(Slitherin studen1, Slitherin student2) {
        int sumFirst = studen1.getAmbition() + studen1.getCunning() + studen1.getDetermination()
                + studen1.getResourcefulness() + studen1.getThirstForPower();
        int sumSecond = student2.getAmbition() + student2.getCunning() + student2.getDetermination()
                + student2.getResourcefulness() + student2.getThirstForPower();
        if (sumFirst > sumSecond) {
            System.out.println("На факультета Слизерина " + studen1.getName() + " талантливее чем " + student2.getName());
        } else if (sumFirst < sumSecond) {
            System.out.println("На факультета Слизерина " + student2.getName() + " талантливее чем " + studen1.getName());
        } else {
            System.out.println("Силы равны");
        }
        System.out.println();
    }

    public void printCalcHogwards(Hogwards student5, Hogwards student6) {
        int first = student5.getSpellPower() + student5.getTransgressDistant();
        int second = student6.getSpellPower() + student6.getTransgressDistant();
        if (first > second) {
            System.out.println(student5.getName() + " обладает большей мощностью магии чем " + student6.getName());
        } else if (first < second) {
            System.out.println(student6.getName() + " обладает большей мощностью магии чем " + student5.getName());
        } else {
            System.out.println(student5.getName() + " и " + student6.getName() + " равны по магической силе");
        }
        System.out.println();
    }
}

