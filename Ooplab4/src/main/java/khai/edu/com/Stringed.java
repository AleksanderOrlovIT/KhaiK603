package khai.edu.com;

public class Stringed extends Instrument{
    private String stringedType = "default string";

    public Stringed(String name) {
        super(name);
        System.out.println(getName() + " that is a " + getStringedType());
    }

    public String getInstrumentType() {
        return "Stringed Instrument";
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
