package course_2.hw_2;

public class Hogwards {
    private int spellPower;
    private int transgressDistant;
    private String name;

    public Hogwards(String name, int spellPower, int transgressDistant) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressDistant = transgressDistant;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , SpellPower: " + spellPower + " , Transgress Distant: " + transgressDistant;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressDistant() {
        return transgressDistant;
    }

    public void setTransgressDistant(int transgressDistant) {
        this.transgressDistant = transgressDistant;
    }
}
