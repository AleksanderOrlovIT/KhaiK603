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
}
