package khai.edu.com;

import java.util.Random;

public class Stringed extends Instrument implements  StringedInterface {
    Random random = new Random();
    private String stringedType = "default string";
    private String name;
    private String instrumentType = "default instrument";

    public Stringed(String name){
        super();
    }

    public Stringed(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getStringedType(){
        return stringedType;
    }

    public void makeSound(){
        System.out.println("Wooooo");
    }

    public void makeMelody(int times){
        while (times > 0){
            pullString();
            makeSound();
            times--;
        }
    }


    public void pullString(){
        System.out.println("You`ve pulled a string");
    }
}
