package khai.edu.com;

public class Bowed extends Stringed{

    public Bowed(String name) {
        super(name);
    }

    public String getStringedType(){
        return "Bowed";
    }

    public void addTypeToName(){
        String name = getName();
        String instrumentType = getInstrumentType();
        new Bowed(name + " " + instrumentType + "Bowed");
    }

    public void pullString(){
        System.out.println("You`ve pulled a bowed string");
    }

    public void makeMelody(int times){
        while (times > 0) {
            pullString();
            makeSound();
            times--;
        }
    }
}
