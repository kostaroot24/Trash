package com.kostaroot.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collect {
    private List<Integer> numbers;

    public Collect(){
        numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        numbers.add(18);
        numbers.add(20);
        numbers.add(23);
    }

    public void printList(){
        for (Integer num: numbers) {
            System.out.println(num);
        }
    }
    
    public void addToList(Integer num){
        numbers.add(num);
    }
    
    public void removeDivByNum(Integer div){
        List<Integer> numbers1 = new ArrayList<>(numbers);
        for (Integer number:numbers1) {
            if( number%div == 0 ) {
                System.out.println("Number was deleted= "+numbers.indexOf(number));
                numbers.remove(numbers.indexOf(number));
            }
        }
    }

    public void randNumber( int iteration ){
        Random random = new Random();
        int yesCount = 0;
        for (int i = 0; i < iteration; i++) {
            yesCount += random.nextInt(2);
        }
        if( yesCount > iteration/2)
            System.out.println("You decision: yes "+yesCount);
        else
            System.out.println("You decision: no "+yesCount);

    }
}
