package khai.edu.com;

import java.util.Random;

public class Instrument {
    Random random = new Random();
    private String name;
    private String instrumentType = "default instrument";

    public Instrument(String name) {
        this.name = name + " is a " + getInstrumentType();
        System.out.println(getName() + " and it makes this melody");
        makeMelody(5);
    }

    public Instrument(){}

    public String getName(){
        return name;
    }

    public void setName(String name){this.name = name;}

    public String getInstrumentType(){
        return instrumentType;
    }

    private void makeSound(){
        int temp = random.nextInt(3);
        switch (temp) {
            case 0 -> System.out.println("Boom");
            case 1 -> System.out.println("Whistle");
            case 2 -> System.out.println("Plunk");
        }
    }

    public void makeMelody(int times){
        while (times>0){
            makeSound();
            times--;
        }
    }
}
