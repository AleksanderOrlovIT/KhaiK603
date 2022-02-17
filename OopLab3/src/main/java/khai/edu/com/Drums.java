package khai.edu.com;

public class Drums extends Instrument{
    private String instrumentType = "Drum instrument";

    public String getInstrumentType(){
        return instrumentType;
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

}
