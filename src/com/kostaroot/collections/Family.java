package com.kostaroot.collections;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return familyMemberNumber == family.familyMemberNumber && name.equals(family.name) && title.equals(family.title) && nameOfEmblem.equals(family.nameOfEmblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyMemberNumber, title, nameOfEmblem);
    }

    @Override
    public String toString() {
        return "Family " +
                "name: " + name  +
                "\n familyMemberNumber: " + familyMemberNumber +
                "\n title: " + title +
                "\n nameOfEmblem: " + nameOfEmblem;
    }

    @Override
    public int compareTo(Family family) {
        return 0;
    }
}