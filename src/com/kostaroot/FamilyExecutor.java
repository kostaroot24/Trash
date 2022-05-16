package com.kostaroot;

import com.kostaroot.collections.Family;
import com.kostaroot.collections.FamilyComparatorByMemberNumber;

import java.util.*;
import java.util.stream.Collectors;

public class FamilyExecutor {
    private Map<Integer, Family> familyMap;

    public FamilyExecutor(){
        familyMap = new TreeMap<>();
    }

    public void run(){
        System.out.println("Will be execute");
        createMap();
        familyMap.values().
                stream().
                sorted(new FamilyComparatorByMemberNumber()).
                forEach(System.out::println);


    }

    private void createMap(){
        familyMap.put(1,new Family("Lanister",10,"King","Lion"));
        familyMap.put(2,new Family("Targarian",3,"Iron tron","Dragon"));
        familyMap.put(10,new Family("Znow",13,"Winter king","Wolf"));
        familyMap.put(7,new Family("Aelish",1,"lie","gold"));
    }
}
