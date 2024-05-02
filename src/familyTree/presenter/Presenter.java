package src.familyTree.presenter;

import java.time.LocalDate;

import javax.swing.text.View;

import src.familyTree.model.FamilyTree;
import src.familyTree.model.Gender;
import src.familyTree.model.Human;
import src.familyTree.model.Servis;

public class Presenter {
    private View view;
    private Servis servis;

    public Presenter(View view) {
        this.view = view;
        this.servis =  new Servis();
    }

    public boolean add(String name, Gender gender, LocalDate birthDate, LocalDate deathDate) {
        return Servis(name, gender, birthDate, deathDate);
    }

    public void getFamilyTreeListInfo() {
        String info = servis.getFamilyTree();
        view.printAnswer(info);
    }

    public void sortByAge() {
        servis.sortByAge();
        getFamilyTreeListInfo();
    }

    public void sortByName() {
        servis.sortByName();
        getFamilyTreeListInfo();
    }
    public void read(String nameFile){
        servis.read(nameFile);
        getFamilyTreeListInfo();
    }
    public void write(List<Human> familyTree, String nameFile){
        servis.write(familyTree, nameFile);
        getFamilyTreeListInfo();
    }    
    public Human getHuman(String name){
        return servis.getHuman(name);
    }
    public void addChild(Human human, String name, Gender gender, LocalDate birthDate, LocalDate deathDate ){
        servis.addChild(human, name, gender, birthDate, deathDate);
    }
    public void addParent(Human human, String name, Gender gender, LocalDate birthDate, LocalDate deathDate){
        servis.addParent(human, name, gender, birthDate, deathDate);
    }
 
}
