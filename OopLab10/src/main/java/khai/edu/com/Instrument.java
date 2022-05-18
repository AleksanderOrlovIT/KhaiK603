package khai.edu.com;

import java.util.Random;

public class Instrument {
    Random random = new Random();
    public String name;
    private String instrumentType = "default instrument";

    public Instrument(String name) {
        this.name = name + " is a " + getInstrumentType();
        System.out.println(getName() + " and it makes this melody");
    }

    public Instrument(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInstrumentType(){
        return instrumentType;
    }
}
