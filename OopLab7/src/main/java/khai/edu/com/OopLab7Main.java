package khai.edu.com;

import percussion.PercussionStringed;

import java.util.Scanner;

public class OopLab7Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instrument ins = new Instrument("Instrument");
        Instrument.Stringed str = new Instrument.Stringed("Stringed");
        Instrument.Drums drums = new Instrument.Drums("Drums");
        Instrument.Wind wind = new Instrument.Wind("Wind");
        str.makePluckedStringed();
        PercussionStringed ps = new PercussionStringed("Percussion stringed"){
            public void makeMelody(int times) {
                times = 5;
                while (times > 0){
                    System.out.println("You`ve pulled a percussion string");
                    System.out.println("Wooooo");
                    times--;
                }
            }
        };
        Bowed bowed = new Bowed() {
            public void BowedInfo(String name) {
                int times = 5;
                name = name + " is a stringed instrument and is a bowed instrument";
                System.out.println(name + " and it makes this melody");
                while (times > 0){
                    System.out.println("You`ve pulled a bowed string");
                    System.out.println("Wooooo");
                    times--;
                }
            }
        };
        bowed.BowedInfo("Bowed");
    }
}
