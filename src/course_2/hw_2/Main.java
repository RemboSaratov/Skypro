package course_2.hw_2;

public class Main {
    public static void main(String[] args) {
        Cogtevran ZhouChang = new Cogtevran ("Zhou Chang", 4, 67, 89, 12, 55, 22);
        Cogtevran PadmaPatil = new Cogtevran("Padma Patil", 5, 77, 44, 36, 21, 43);
        Cogtevran MarcusBelby = new Cogtevran("Marcus Belby", 20, 23, 46, 55, 77, 10);
        Grifindor HarryPotter = new Grifindor("Harry Potter", 90, 67, 89, 99, 99);
        Grifindor HermioneGranger = new Grifindor("Hermione Granger", 45, 12, 11, 78, 61);
        Grifindor RonWeasley = new Grifindor("Ron Weasley", 20, 23, 46, 55, 77);
        Puffendy ZachariahSmith = new Puffendy("Zachariah Smith", 66, 70, 44, 26, 82);
        Puffendy CedricDiggory = new Puffendy("Cedric Diggory", 39, 17, 56, 2, 4);
        Puffendy JustinFinchFletchley = new Puffendy("Justin Finch-Fletchley", 78, 90, 6, 88, 47);
        Slitherin DracoMalfoy = new Slitherin("Draco Malfoy", 36, 78, 6, 10, 33, 20, 56);
        Slitherin GrahamMontague = new Slitherin("Graham Montague", 45, 6, 7, 33, 71, 85, 42);
        Slitherin GregoryGoyle = new Slitherin("Gregory Goyle", 50, 44, 22, 18, 74, 89, 66);
        PrintClass printClass = new PrintClass();
        printClass.printCalcCogtevran(MarcusBelby,PadmaPatil);
        printClass.printCalcGrifindors(HarryPotter, HermioneGranger);
        printClass.printCalcPuffendies(ZachariahSmith, JustinFinchFletchley);
        printClass.printCalcSlitherins(DracoMalfoy, GrahamMontague);
        printClass.printCalcHogwards(ZhouChang, DracoMalfoy );
        System.out.println(ZhouChang.toString()); //  не могу создать метод в классе для методов чтобы выводилась
        //вся информация по любому ученику, получается только через toString

    }
}
