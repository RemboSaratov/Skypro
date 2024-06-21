package course_2.hw_2;

import java.util.Objects;

public class Cogtevran extends Hogwards {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Cogtevran(String name, int spellPower, int transgressDistant, int mind, int wisdom, int wit, int creativity) {
        super(name, spellPower, transgressDistant);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , mind: " + mind +
                " , wisdom: " + wisdom +
                " , wit:" + wit +
                " , creativity: " + creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cogtevran cogtevran = (Cogtevran) o;
        return mind == cogtevran.mind && wisdom == cogtevran.wisdom && wit == cogtevran.wit && creativity == cogtevran.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mind, wisdom, wit, creativity);
    }
}
