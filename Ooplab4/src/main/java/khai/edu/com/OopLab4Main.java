package khai.edu.com;

import percussion.PercussionStringed;

import java.util.Scanner;

public class OopLab4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input instrument name");
        Instrument instrument = new Instrument(sc.next());
        System.out.println("Input stringed name");
        Stringed str = new Stringed(sc.next());
        System.out.println("Input drum type");
        Drums drum = new Drums(sc.next());
        System.out.println("Input wind type");
        Wind wind = new Wind(sc.next());
        System.out.println("Input bowed type");
        Bowed bowed = new Bowed(sc.next());
        System.out.println("Input plucked type");
        Plucked plucked = new Plucked(sc.next());
        System.out.println("Input percussion stringed");
        PercussionStringed ps = new PercussionStringed(sc.next());
    }
}
