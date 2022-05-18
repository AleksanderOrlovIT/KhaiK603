package khai.edu.com;

import java.util.*;

public class OopLab10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Instrument instrument = new Instrument();
        MakeSound makeSound = () -> {
            int temp = random.nextInt(3);
            switch (temp) {
                case 0 -> System.out.println("Boom");
                case 1 -> System.out.println("Whistle");
                case 2 -> System.out.println("Plunk");
            }
        };
        MakeMelody makeMelody = (times, MakeSound) -> {
            while (times > 0) {
                MakeSound.makeSound();
                times--;
            }
        };
        instrument.setName("Instrument");
        System.out.println(instrument.getName() + " makes this melody ");
        makeMelody.makeMelody(5, makeSound);

        MakeSound makeStringedSound = () -> {
            System.out.println("You`ve pulled a string");
            System.out.println("Brin brin brin");
        };
        Stringed stringed = new Stringed("Stringed");
        makeMelody.makeMelody(5, makeStringedSound);

        MakeSound makeWindSound = () -> {
            System.out.println("You blew the wind instrument");
            System.out.println("Wooooo");
        };
        Wind wind = new Wind("Wind");
        makeMelody.makeMelody(5, makeWindSound);

    }
}
