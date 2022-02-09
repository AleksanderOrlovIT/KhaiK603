package khai.edu.com;

import java.util.Scanner;

public class OopLab1Main {
    public static void main(String[] args) {
        Plucked abc = new Plucked();
        Scanner sc = new Scanner(System.in);
        abc.setName(sc.next());
        System.out.println(abc.name + " " + abc.instrumentType);
        Instrument ins = new Instrument();
        System.out.println(ins.name);
    }
}

    class Instrument{
        String name;
        String instrumentType = "Default";

        protected void setName(String name){
            this.name = name;
        }
    }

    class Stringed extends Instrument{
        String instrumentType = "Stringed Instrument";
        String stringedType = "Default";
    }

    class Plucked extends Stringed{
       String stringedType = "Plucked";
    }

    class Bowed extends Stringed{
        String stringedType = "Bowed";
    }

    class Wind extends Instrument{
        String instrumentType = "Wind Instrument";
        String windType = "Wind type";
    }

    class Copper extends Wind{
        String windType = "Copper wind instrument";
    }

    class Wood extends Wind{
        String windType = "Wood wind instrument";
    }