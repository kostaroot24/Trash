package com.kostaroot;

import com.kostaroot.collections.Family;
import com.kostaroot.collections.FamilyComparatorByMemberNumber;
import com.kostaroot.collections.FamilyComparatorByTitle;

import java.util.*;
import java.util.stream.Collectors;

public class FamilyExecutor {
    private Map<Integer, Family> familyMap;

    public FamilyExecutor(){
        familyMap = new HashMap<>();
    }

    public void run(){
        System.out.println("Will be execute");
        createMap();
        System.out.println("Sorted default order");
        printSortedFamily();
        System.out.println("Sorted by number");
        printSortedFamily(new FamilyComparatorByMemberNumber());
        System.out.println("Sorted by Title reverse order");
        printSortedFamily(new FamilyComparatorByTitle());

        

    }

    private void createMap(){
        familyMap.put(1,new Family("Lanister",10,"King","Lion"));
        familyMap.put(2,new Family("Targarian",3,"Iron tron","Dragon"));
        familyMap.put(10,new Family("Znow",13,"Winter king","Wolf"));
        familyMap.put(7,new Family("Aelish",1,"Lie","gold"));
    }

    private void printSortedFamily(){
        familyMap.values().
                stream().
                sorted().
                forEach(System.out::println);
    }

    private void printSortedFamily(Comparator comparator){
        familyMap.values().
                stream().
                sorted(comparator).
                forEach(System.out::println);
    }
}
