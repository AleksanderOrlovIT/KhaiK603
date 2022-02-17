package khai.edu.com;

public class Plucked extends Stringed{
    private String stringedType = "Plucked";

    public String getStringedType(){
        return stringedType;
    }

    public void addTypeToName(){
        String name = getName();
        String instrumentType = getInstrumentType();
        setName(name + " " + instrumentType + stringedType);
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
