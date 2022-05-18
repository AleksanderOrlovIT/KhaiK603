package khai.edu.com;

public class Wind extends Instrument{
    private String windType = "Default wind type";

    public Wind(String name){
        super(name);
        System.out.println(getName() + " that is a " + getWindType());
    }

    public Wind(){}

    public String getInstrumentType(){
        return "Wind Instrument";
    }

    public String getWindType(){
        return windType;
    }

    private void makeSound(){
        System.out.println("Wooooo");
    }

    public void MakeMelody(int times){
        while (times > 0){
            makeSound();
        }
    }

    public void blow(){
        System.out.println("You blew the wind instrument");
    }
}
