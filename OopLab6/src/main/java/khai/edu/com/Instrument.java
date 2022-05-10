package khai.edu.com;

import java.util.Random;

public class Instrument extends AbstractInstrument implements InstrumentInterface {
    Random random = new Random();
    private String name;

    public Instrument(String name) {
        this.name = name + " is a " + getInstrumentType();
        System.out.println(getName() + " and it makes this melody");
        makeMelody(5);
    }

    public Instrument(){}
}
