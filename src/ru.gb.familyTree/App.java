package ru.gb.familyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class App {
    public static void main(String[] args) {
        Human human1 = new Human("Anton Vas Vas", Gender.Female, LocalDate.of(13, 10, 2000));
        List<Human> family_tree = new ArrayList<>();
        family_tree.add(human1);
        Human human2 = new Human("art", Gender.Male, LocalDate.of(13, 10, 2001));
        family_tree.add(human2);
        System.out.println(family_tree.sort(HumanComparatorByAge));
    }
}
