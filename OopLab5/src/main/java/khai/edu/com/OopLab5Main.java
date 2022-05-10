package khai.edu.com;

import percussion.PercussionStringed;

import java.util.Scanner;

public class OopLab5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte tempTimes = 127;
        System.out.println("Byte variable = " + tempTimes);
        byte anotherTimes = tempTimes;//Тотожне
        System.out.println("New byte variable = " + anotherTimes);
        int times = tempTimes;//Розширення примітивного типу
        System.out.println("Integer variable after casting = " + times);
        times = 100000;
        short shortTimes = (short)times;//Звуження примітивного типу
        System.out.println("Short variable after casting = " + shortTimes);
        Instrument instrument = new Stringed();//Розширення об'єктного типу
        Stringed newInstr = new Stringed();
        newInstr.setName(sc.next());
        instrument = newInstr;//звуження об'єктного типу
        System.out.println(instrument.getName() + " is a " + instrument.getInstrumentType());
        System.out.println(instrument.toString());//приведення до рядка
        //boolean a = times; Неправильне приведення
    }
}
