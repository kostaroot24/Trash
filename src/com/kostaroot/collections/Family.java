package com.kostaroot.collections;

public class Family implements Comparable<Family>{
    private String name;
    private int familyMemberNumber;
    private String title;
    private String nameOfEmblem;

    public Family(String name, int familyMemberNumber, String title, String nameOfEmblem) {
        this.name = name;
        this.familyMemberNumber = familyMemberNumber;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public int getFamilyMemberNumber() {
        return familyMemberNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyMemberNumber(int familyMemberNumber) {
        this.familyMemberNumber = familyMemberNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNameOfEmblem(String nameOfEmblem) {
        this.nameOfEmblem = nameOfEmblem;
    }
    
}

