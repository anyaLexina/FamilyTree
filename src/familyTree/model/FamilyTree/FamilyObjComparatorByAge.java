package src.familyTree.model;

public class FamilyObjComparatorByAge<T extends FamilyObject> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}