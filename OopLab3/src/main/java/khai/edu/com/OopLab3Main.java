package khai.edu.com;

import percussion.PercussionStringed;

import java.util.Scanner;

public class OopLab3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instrument instrument = new Instrument();
        System.out.println("Please input " + instrument.getInstrumentType() + " name");
        instrument.setName(sc.next());
        System.out.println(instrument.getInstrumentType() + " " + instrument.getName());
        instrument.makeMelody(5);

        Stringed str = new Stringed();
        System.out.println("Please input " + str.getInstrumentType() + " name");
        str.setName(sc.next());
        System.out.println(str.getInstrumentType() + " " + str.getStringedType() + " " + str.getName());

        Drums drum = new Drums();
        System.out.println("Please input " + drum.getInstrumentType() + " name");
        drum.setName(sc.next());
        System.out.println("Please input " + drum.getName() + " cost");
        drum.makeMelody(5);
        System.out.println(drum.getInstrumentType() + " " + drum.getName());

        Wind wind = new Wind();
        System.out.println("Please input " + wind.getInstrumentType() + " name");
        wind.setName(sc.next());
        System.out.println(wind.getInstrumentType() + " " + wind.getWindType() + " " + wind.getName());

        Bowed bowed = new Bowed();
        System.out.println("Please input" + bowed.getStringedType() + " name");
        bowed.setName(sc.next());
        bowed.addTypeToName();
        System.out.println(bowed.getName());

        Plucked plucked = new Plucked();
        System.out.println("Please input" + plucked.getStringedType() + " name");
        plucked.setName(sc.next());
        plucked.addTypeToName();
        System.out.println(plucked.getName());

        PercussionStringed ps = new PercussionStringed();
        System.out.println("Please input" + ps.getStringedType() + " name");
        ps.setName(sc.next());
        ps.addTypeToName();
        System.out.println(ps.getName());
        ps.makeMelody(5);
    }
}
