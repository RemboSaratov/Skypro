package course_2.hw_2;

public class Slitherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slitherin(String name, int spellPower, int transgressDistant, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, spellPower, transgressDistant);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public String printProperties() {
        return super.printPropertiesHogward() +
                " , cunning: " + cunning +
                " , determination: " + determination +
                " , ambition: " + ambition +
                " , resourcefulness: " + resourcefulness +
                " , thirstForPower: " + thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , cunning: " + cunning +
                " , determination: " + determination +
                " , ambition: " + ambition +
                " , resourcefulness: " + resourcefulness +
                " , thirstForPower: " + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
