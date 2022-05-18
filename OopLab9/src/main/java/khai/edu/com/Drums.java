package khai.edu.com;

public class Drums extends Instrument implements Comparable{
    private String drumType = "Default drum type";

    public Drums(String name){
        super(name);
        System.out.println(getName() + " that is a " + getDrumType());
    }

    public Drums(){}

    public String getInstrumentType(){
        return "Drum instrument";
    }

    public String getDrumType(){
        return drumType;
    }

    private void hitDrum(){
        System.out.println("boom");
    }

    public void makeMelody(int times){
        while (times > 0){
            hitDrum();
            times--;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
