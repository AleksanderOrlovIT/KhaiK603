package khai.edu.com;

public class Bowed extends Stringed{

    public Bowed(String name) {
        super(name);
    }

    public Bowed(){}

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
}
