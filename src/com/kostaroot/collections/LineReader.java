package com.kostaroot.collections;

import java.util.Scanner;

public class LineReader {
    private String line;
    private int number;

    public LineReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put numbers");
        number = scanner.nextInt();
    }
}
