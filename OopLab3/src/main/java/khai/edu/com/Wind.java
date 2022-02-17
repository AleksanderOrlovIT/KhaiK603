package khai.edu.com;

public class Wind extends Instrument{
    private String instrumentType = "Wind Instrument";
    private String windType = "Default wind type";

    public String getInstrumentType(){
        return instrumentType;
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
