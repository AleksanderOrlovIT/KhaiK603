package khai.edu.com;

import java.util.Random;

public class Instrument {
    Random random = new Random();
    private String name;
    private String instrumentType = "Default instrument";

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getInstrumentType(){
        return instrumentType;
    }

    private void makeSound(){
        int temp = random.nextInt(3);
        switch (temp){
            case 0:
                System.out.println("Boom");
                break;
            case 1:
                System.out.println("Whistle");
                break;
            case 2:
                System.out.println("Plunk");
                break;
        }
    }

    public void makeMelody(int times){
        while (times>0){
            makeSound();
            times--;
        }
    }
}
