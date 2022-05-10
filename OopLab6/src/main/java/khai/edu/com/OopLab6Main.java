package khai.edu.com;

import percussion.PercussionStringed;

import java.util.Scanner;

public class OopLab6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instrument instr = new Instrument();
        instr.setName(sc.next());
        System.out.println(instr.getName() + " " + instr.getInstrumentType());
        Stringed str = new Stringed();
        str.setName(sc.next());
        System.out.println(str.getName() + " " + str.getInstrumentType() + " " + str.getStringedType());
        Wind wind = new Wind();
        wind.setName("Wind");
        System.out.println(wind.getName() + " " + wind.getInstrumentType() + " " + wind.getWindType());
        Drums drums = new Drums();
        drums.setName("Drums");
        System.out.println(drums.getName() + " " + drums.getInstrumentType() + " " + drums.getDrumType());
        Plucked plucked = new Plucked();
        plucked.setName("Plucked");
        System.out.println(plucked.getName() + " " + plucked.getInstrumentType() + " " + plucked.getStringedType());
        Bowed bowed = new Bowed();
        bowed.setName("Bowed");
        System.out.println(bowed.getName() + " " + bowed.getInstrumentType() + " " + bowed.getStringedType());
        PercussionStringed ps = new PercussionStringed();
        ps.setName("Percussion stringed");
        System.out.println(ps.getName() + " " + ps.getInstrumentType() + " " + ps.getStringedType());
    }
}
