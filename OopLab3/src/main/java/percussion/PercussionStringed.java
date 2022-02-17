package percussion;

import khai.edu.com.Stringed;

public class PercussionStringed extends Stringed {
    private String stringedType = "Percussion";

    public String getStringedType(){
        return stringedType;
    }

    public void addTypeToName(){
        String name = getName();
        String instrumentType = getInstrumentType();
        setName(name + " " + instrumentType + stringedType);
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
