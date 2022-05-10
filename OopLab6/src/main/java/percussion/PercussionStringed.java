package percussion;

import khai.edu.com.Stringed;
import khai.edu.com.StringedInterface;

public class PercussionStringed extends Stringed implements StringedInterface {

    public PercussionStringed(String name) {
        super(name);
    }

    public PercussionStringed(){}

    public String getStringedType(){
        return"Percussion";
    }

    public void addTypeToName(){
        String name = getName();
        String instrumentType = getInstrumentType();
        new PercussionStringed(name + " " + instrumentType + "Percussion");
    }

    public void pullString(){
        System.out.println("You`ve pulled a percussion string");
    }

    public void makeMelody(int times){
        while (times > 0) {
            pullString();
            makeSound();
            times--;
        }
    }
}
