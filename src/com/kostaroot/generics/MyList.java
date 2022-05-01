package com.kostaroot.generics;

import java.util.ArrayList;
import java.util.List;

public class MyList <T extends Comparable<T>>{
    private List<T> listItems;

    public MyList(){
        listItems = new ArrayList<>();
    }

    public void addToList(T item){
        listItems.add(item);
    }

    public List<T> getListItems() {
        return listItems;
    }

    public void printMyList(){
        System.out.println("All list");
        for (T it:listItems) {
            System.out.println(it);
        }
    }

    public T maxItem(){
        T maxNum = listItems.get(0);
        for (T it:
             listItems) {
            if (maxNum.compareTo(it) < 0)
                maxNum = it;
        }
        return maxNum;
    }

    public T minItem(){
        T minNum = listItems.get(0);
        for (T it:
                listItems) {
            if (minNum.compareTo(it) > 0)
                minNum = it;
        }
        return minNum;
    }

}