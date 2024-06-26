package course_2.hw_2;

public class Puffendy extends Hogwards {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendy(String name, int spellPower, int transgressDistant, int diligence, int loyalty, int honesty) {
        super(name, spellPower, transgressDistant);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public String printProperties() {
        return super.printPropertiesHogward() +
                " , diligence: " + diligence +
                " , loyalty: " + loyalty +
                " , honesty: " + honesty;
    }
    @Override
    public String toString() {
        return super.toString() +
                " , diligence: " + diligence +
                " , loyalty: " + loyalty +
                " , honesty: " + honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
