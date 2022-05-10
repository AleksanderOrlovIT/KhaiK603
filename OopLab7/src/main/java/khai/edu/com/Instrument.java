package khai.edu.com;

import java.util.Random;

public class Instrument {
    Random random = new Random();
    private String name;
    private String instrumentType = "default instrument";

    public Instrument(String name) {
        this.name = name + " is a " + getInstrumentType();
        System.out.println(getName() + " and it makes this melody");
        makeMelody(5);
    }

    public Instrument() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    private void makeSound() {
        int temp = random.nextInt(3);
        switch (temp) {
            case 0 -> System.out.println("Boom");
            case 1 -> System.out.println("Whistle");
            case 2 -> System.out.println("Plunk");
        }
    }

    public void makeMelody(int times) {
        while (times > 0) {
            makeSound();
            times--;
        }
    }

    public static class Stringed extends Instrument {
        private String stringedType = "default string";

        public Stringed(String name) {
            super(name);
            System.out.println(getName() + " that is a " + getStringedType());
        }

        public Stringed() {
        }

        public String getStringedType() {
            return stringedType;
        }

        public void makeSound() {
            System.out.println("Wooooo");
        }

        public void makeMelody(int times) {
            while (times > 0) {
                pullString();
                makeSound();
                times--;
            }
        }

        public void pullString() {
            System.out.println("You`ve pulled a string");
        }

        public void makePluckedStringed(){
            class Plucked extends Instrument.Stringed{
                public Plucked(String name) {
                    super(name);
                    addTypeToName();
                }

                public String getStringedType(){
                    return"Plucked";
                }

                public void addTypeToName(){
                    String name = getName();
                    String instrumentType = getInstrumentType();
                    System.out.println((name + " " + instrumentType + "Plucked"));
                }

                public void pullString(){
                    System.out.println("You`ve pulled a plucked string");
                }

                public void makeMelody(int times){
                    while (times > 0) {
                        pullString();
                        makeSound();
                        times--;
                    }
                }
            }
            Plucked plucked = new Plucked("Plucked");
        }
    }

    static class Drums {
        private String name;
        private String drumType = "Default drum type";

        public Drums(String name) {
            this.name = name + " is a " + getInstrumentType();
            System.out.println(getName() + " and it makes this melody");
            makeMelody(5);
            System.out.println(getName() + " that is a " + getDrumType());
        }

        public String getInstrumentType() {
            return "Drum instrument";
        }

        public String getDrumType() {
            return drumType;
        }

        private void hitDrum() {
            System.out.println("boom");
        }

        public void makeMelody(int times) {
            while (times > 0) {
                hitDrum();
                times--;
            }
        }

        public String getName() {
            return name;
        }
    }

    static class Wind extends Instrument{
        private String windType = "Default wind type";

        public Wind(String name){
            super(name);
            System.out.println(getName() + " that is a " + getWindType());
        }

        public String getInstrumentType(){
            return "Wind Instrument";
        }

        public String getWindType(){
            return windType;
        }

        private void makeSound(){
            System.out.println("Wooooo");
        }

        public void MakeMelody(int times){
            while (times > 0){
                makeSound();
            }
        }

        public void blow(){
            System.out.println("You blew the wind instrument");
        }
    }
}
