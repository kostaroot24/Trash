package com.kostaroot.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserExecutor {
    private List<User> users;

    public UserExecutor(){
        users = new ArrayList<>();
    }

    public void run(){
        usersCreated();
        System.out.println(users);
        printUserAgeOver40();
        printUserAgeLess50FromDnepr();
    }

    private void usersCreated(){
        users.add(new User("Dimas",29,"Sumy"));
        users.add(new User("Vasia",16,"Dnepr"));
        users.add(new User("Petia",23,"Dnepr"));
        users.add(new User("Helen",42,"Lutsk"));
        users.add(new User("Helen",92,"Chernigiv"));
        users.add(new User("Sergey",5,"Kyiv"));
        users.add(new User("Maryna",32,"Kyiv"));
        users.add(new User("Ivan",64,"Lviv"));
        users.add(new User("Kolia",25,"Kyiv"));
        users.add(new User("Iryna",26,"Poltava"));
    }

    public void printUserAgeOver40(){
        System.out.println("All users with age older than 40 ");
        users.stream().
                filter(p->p.getAge()>40).
                forEach(System.out::println);
    }

    public void printUserAgeLess50FromDnepr(){
        System.out.println("All users with age younger than 50 from Dnerp city");
        users.stream().
                filter(p->p.getAge()<50 && p.getCity().equals("Dnepr")).
                forEach(System.out::println);
    }
}
