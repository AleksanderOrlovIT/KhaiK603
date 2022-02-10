package khai.edu.com;

import java.util.Scanner;

public class OopLab1Main {
    public static void main(String[] args) {
        Plucked abc = new Plucked();
        Scanner sc = new Scanner(System.in);
        abc.setName(sc.next());
        System.out.println(abc.name + " " + abc.instrumentType);
        Instrument ins = new Instrument();
        Plucked pluck = new Plucked();
        pluck.setName(sc.next());
        System.out.println(pluck.name);
        System.out.println(ins.name);
        PercussionStringed perc = new PercussionStringed();
        perc.setName(sc.next());
        System.out.println(perc.instrumentType + " " + perc.name + " " + perc.stringedType);
    }


    static class Instrument {
        String name;
        String instrumentType = "Default";

        protected void setName(String name) {
            this.name = name;
        }
    }

    static class Wind extends Instrument {
        String instrumentType = "Wind Instrument";
        String windType = "Default type";
    }

    static class Drums extends  Instrument{
        String instrumentType = "Drum instrument";
    }

    static class Stringed extends Instrument {
        String instrumentType = "Stringed Instrument";
        String stringedType = "Default";
    }

    static class Plucked extends Stringed {
        String stringedType = "Plucked";
    }

    static class Bowed extends Stringed {
        String stringedType = "Bowed";
    }

    static class PercussionStringed extends Stringed{
        String stringedType = "Percussion";
    }
}