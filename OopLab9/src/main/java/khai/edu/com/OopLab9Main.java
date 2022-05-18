package khai.edu.com;

import java.util.*;

public class OopLab9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Instrument> instruments = new ArrayList<>();
        Instrument instrument = new Instrument();
        instruments.add(instrument);
        instrument.setName("213");
        instruments.get(0).setName("Instrument");
        System.out.println(instruments.get(0).getName());

        LinkedList <Stringed> stringeds = new LinkedList<>();
        Stringed stringed = new Stringed();
        stringed.setName("Stringed");
        stringeds.add(stringed);
        System.out.println(stringeds.get(0).getName());

        HashSet <Wind> winds = new HashSet<>();
        Wind wind = new Wind();
        wind.setName("Wind");
        winds.add(wind);
        System.out.println(winds.iterator().next().getName());

        TreeSet <Drums> drums = new TreeSet<>();
        Drums drum = new Drums();
        drum.setName("Drums");
        drums.add(drum);
        System.out.println(drums.iterator().next().getName());
        //Comparable Drums

        LinkedHashSet <Bowed> boweds = new LinkedHashSet<>();
        Bowed bowed = new Bowed();
        bowed.setName("Bowed");
        boweds.add(bowed);
        System.out.println(boweds.iterator().next().getName());

        PriorityQueue <PercussionStringed> ps = new PriorityQueue<>();
        PercussionStringed percussionStringed = new PercussionStringed();
        percussionStringed.setName("Percussion stringed");
        ps.add(percussionStringed);
        System.out.println(ps.iterator().next().getName());
        //Comparable PercussionStringed

        HashMap <Integer, Plucked> pluckedHashMap = new HashMap<>();
        Plucked plucked = new Plucked();
        plucked.setName("Plucked");
        pluckedHashMap.put(1,plucked);
        System.out.println(pluckedHashMap.get(1).getName());

        TreeMap <Integer, Plucked> pluckedTreeMap = new TreeMap<>();
        pluckedTreeMap.put(1, plucked);
        System.out.println(pluckedTreeMap.get(1).getName());

        LinkedHashMap <Integer, Plucked> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, plucked);
        System.out.println(linkedHashMap.get(1).getName());
    }
}
