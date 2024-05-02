package src.familyTree.model;

import java.time.LocalDate;
import java.util.List;

import src.familyTree.model.Human.Human;

public class Servis {
    private List<Human> familyTree;

    public Servis() {
        this.familyTree = new FamilyTree<>();
    }

    public boolean addHuman(String name, Gender gender, LocalDate birthData, LocalDate deathDate) {
        Human human = new Human(name, gender, birthData, deathDate);
        return familyTree.add(human);
    }

    public void sortByAge() {
        familyTree.sortByAge();
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void read(String fileName){
        FileHandler fileHandler = new FileHandler();
        fileHandler.read(fileName);
    }

    public void write(List<Human> familyTree, String namefile) {
        FileHandler fileHandler = new FileHandler();
        fileHandler(familyTree, namefile);
    }
    public String getFamilyTree(){
        return familyTree.toString();
    }
    public Human getHuman(String name){
        return familyTree.getHuman(name);
    }
    public void addChild(Human human, String name, Gender gender, LocalDate birthData, LocalDate deathDate){
        Human newHuman = new Human(name, gender, birthData, deathDate);
        human.addChild(newHuman);

    }
    public void addParent(Human human, String name, Gender gender, LocalDate birthData, LocalDate deathDate){
        Human newHuman = new Human(name, gender, birthData, deathDate);
        human.addParent(newHuman);
}
