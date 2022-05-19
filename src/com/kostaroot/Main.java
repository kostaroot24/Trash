package com.kostaroot;

import com.kostaroot.stream.UserExecutor;

public class Main {
    public static void main( String args[] ){
        System.out.println("Hello future trash");
        //new Executor().run();
        //new FamilyExecutor().run();
        new UserExecutor().run();
    }
}
