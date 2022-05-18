package khai.edu.com;

import java.util.Scanner;

public class OopLab8Main {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Instrument();
        instruments[0].setName("Flute");
        System.out.println(instruments[0].getName());
        try {
            instruments[1].getName();
        } catch (NullPointerException e) {
            System.out.println("There is no object in the array");
        }
        randomMethod();
        anotherMethod();
        try {
            instruments[2].getName();
        }catch (NullPointerException e){
            System.out.println("There is no object in the array");
        }
    }

    public static void randomMethod() throws MyException{
        Stringed str = new Stringed();
        if (str.getName() == null) {
            throw new MyException(1);
        }
    }

    public static void anotherMethod() throws MyException {
        Stringed str = new Stringed();
        str.setName("Logic");
        if (str.getName().equals("Logic")) throw new MyException(2);
    }

    public static class MyException extends Exception {
        public MyException(int exNumber) {
            switch (exNumber) {
                case 1 -> System.out.println("There are no name exception");
                case 2 -> System.out.println("Wrong name exception");
            }
        }
    }
}