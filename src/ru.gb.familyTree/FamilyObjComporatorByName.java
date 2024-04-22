package ru.gb.familyTree;

import java.util.Comparator;

import ru.gb.family_tree.Human;

public class FamilyObjComporatorByName implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
