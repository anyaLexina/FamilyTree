package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class App {
    public static void main(String[] args) {
        Human human1 = new Human("Anton Vas Vas", Gender.Female, LocalDate.of(13, 10, 2000));
        List<Human> family_tree = new ArrayList<>();
        family_tree.add(human1);
        FileHandler fHandler = new FileHandler();
        fHandler.Write(family_tree);
    }
}
