package com.kostaroot.collections;

import java.util.Comparator;

public class FamilyComparatorByMemberNumber implements Comparator<Family> {
    @Override
    public int compare(Family first, Family t1) {
        return Integer.compare(first.getFamilyMemberNumber(),t1.getFamilyMemberNumber());
    }
}
