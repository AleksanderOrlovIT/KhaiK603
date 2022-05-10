package khai.edu.com;

public class Plucked extends Stringed{

    public Plucked(String name) {
        super(name);
    }

    public String getStringedType(){
        return"Plucked";
    }

    public void addTypeToName(){
        String name = getName();
        String instrumentType = getInstrumentType();
        new Plucked(name + " " + instrumentType + "Plucked");
    }

    public void pullString(){
        System.out.println("You`ve pulled a plucked string");
    }

    public void makeMelody(int times){
        while (times > 0) {
            pullString();
            makeSound();
            times--;
        }
    }
}
