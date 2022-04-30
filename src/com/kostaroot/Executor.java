package com.kostaroot;

import com.kostaroot.generics.MyList;

import java.util.List;

public class Executor {

    public void run(){
        System.out.println("Hi man");
        stringList();

    }

    private void stringList(){
        MyList<String> stringMyList = new MyList<>();
        stringMyList.addToList("One");
        stringMyList.addToList("Two");
        stringMyList.addToList("a");
        stringMyList.addToList("War is ended");



        stringMyList.printMyList();
        System.out.println("Max: "+stringMyList.maxItem());
        System.out.println("Min: "+stringMyList.minItem());

        MyList<Integer> numberMyList = new MyList<>();
        numberMyList.addToList(1);
        numberMyList.addToList(-1);
        numberMyList.addToList(100);
        numberMyList.addToList(-25);
        System.out.println("Max: "+numberMyList.maxItem());
        System.out.println("Min: "+numberMyList.minItem());


    }

}
