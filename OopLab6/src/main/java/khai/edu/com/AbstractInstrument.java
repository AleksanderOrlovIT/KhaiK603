package khai.edu.com;

import java.util.Random;

public abstract class AbstractInstrument {
    Random random = new Random();
    private String name;
    private String instrumentType = "default instrument";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInstrumentType(){
        return instrumentType;
    }

    public void makeSound(){
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
