package khai.edu.com;

public class Stringed extends Instrument{
    private String instrumentType = "Stringed Instrument";
    private String stringedType = "default string";

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
            makeSound();
        }
    }

    public void pullString(){
        System.out.println("You`ve pulled a string");
    }
}
