package src.familyTree.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree<T extends FamilyObject> implements Serializable, Iterable<Human> {
    private final List<T> humanList;

    public FamilyTree(List<T> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(T human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);

            addToParents(human);
            addToChildren(human);
            return true;
        }
        return false;
    }

    private void addToParents(T human) {
        for (T parent : human.getParents()) {
            parent.addChild(human);
        }
    }

    private void addToChildren(T human) {
        for (T child : human.getChildren()) {
            child.addParent(human);
        }
    }

    public List<T> getSiblings(T human) {
        List<T> res = new ArrayList<>();
        for (T parent : human.getParents()) {
            for (T child : paren.getChildren()) {
                if (!child.equals(human)) {
                    res.add(child);
                }
            }
        }
        return res;
    }

    public List<T> getByName(String name) {
        List<T> res = new ArrayList<>();
        for (T human : humanList) {
            if (human.getName().equals(name)) {
                res.add(human);
            }
        }
        return res;
    }

    public boolean setWedding(T human1, T human2) {
        if (human1.getSpouse() == null && human2.getSpouse() == null) {
            human1.setSpouse(human2);
            human2.setSpouse(human1);
            return true;
        } else {
            return false;
        }
    }

    public boolean setDivorce(T human1, T human2) {
        if (human1.getSpouse() != null && human2.getSpouse() != null) {
            human1.setSpouse(null);
            human2.setSpouse(null);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getInto();
    }

    public String getInfo() {
        StringBulder sb = new StringBuilder();
        sb.append("In familytree ");
        sb.append(humanList.size());
        sb.append(" object: \n");
        for (T human : humanList) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        humanList.sort(new FamilyObjComparatorByName<>());
    }

    public void sortByAge() {
        humanList.sort(new FamilyObjComparatorByAge<>());
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator(humanList);
    }
}
