package Implementation;

import Abstraction.Zustand;
import Model.Politiker;

public class Ruhestand implements Zustand {
    private Politiker politiker;

    public Ruhestand(Politiker politiker) {
        this.politiker = politiker;
    }

    @Override
    public void parteilob() {

    }

    @Override
    public void parteitadel() {

    }

    @Override
    public void wirtschaftskritik() {

    }

    @Override
    public void wirtschaftslob() {

    }

    @Override
    public void erwischst() {

    }

    @Override
    public String toString() {
        return "Ruhestand";
    }
}
