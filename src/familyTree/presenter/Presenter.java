package src.familyTree.presenter;

import java.time.LocalDate;

import javax.swing.text.View;

import src.familyTree.model.FamilyTree;
import src.familyTree.model.Gender;
import src.familyTree.model.Human;

public class Presenter {
    private View view;
    private FamilyTree<Human> familyTree;

    public Presenter(View view) {
        this.view = view;
        this.familyTree = new FamilyTree<>();
    }

    public boolean add(String name, Gender gender, LocalDate birthDate) {
        return familyTree.add(new Human(name, gender, birthDate));
    }

    public void getFamilyTreeListInfo() {
        String info = familyTree.toString();
        view.printAnswer(info);
    }

    public void sortByAge() {
        familyTree.sortByAge();
        getFamilyTreeListInfo();
    }

    public void sortByName() {
        familyTree.sortByName();
        getFamilyTreeListInfo();
    }
}
