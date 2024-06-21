package course_2.hw_2;

public class Grifindor extends Hogwards{
    private int nobility;
    private int honor;
    private int courage;

    public Grifindor(String name, int spellPower, int transgressDistant, int nobility, int honor, int courage) {
        super(name, spellPower, transgressDistant);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nobility: " + nobility + " , Honor: " + honor + " , Courage " + courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
