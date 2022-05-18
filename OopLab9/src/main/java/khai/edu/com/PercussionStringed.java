package khai.edu.com;

public class PercussionStringed extends Stringed implements Comparable{

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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
