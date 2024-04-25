package src.familyTree.presenter;

import src.familyTree.model.Human;

public class Presenter {
    private View view;
    private FamilyTree<T> familyTree;

    public Presenter(View view) {
        this.view = view;
        this.familyTree = new FamilyTree<>();
    }

    public boolean add(T human) {
        return familyTree.add(human);
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
