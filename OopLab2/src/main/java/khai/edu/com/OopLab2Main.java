package khai.edu.com;

import percussion.PercussionStringed;

public class OopLab2Main {
    public static void main(String[] args) {
        Instrument ins = new Instrument();
        System.out.println(ins.instrumentType);
        Stringed str = new Stringed();
        System.out.println(str.instrumentType);
        Wind wind = new Wind();
        System.out.println(wind.instrumentType);
        Drums drum = new Drums();
        System.out.println(drum.instrumentType);
        Plucked plc = new Plucked();
        System.out.println(plc.stringedType);
        Bowed bowed = new Bowed();
        System.out.println(bowed.stringedType);
        PercussionStringed perc = new PercussionStringed();
        System.out.println(perc.stringedType);
    }
}


