package src.ru.gb.familyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileHandler {
    public void Write(List<T> humanList, String nameFile) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(nameFile));
        objectOutputStream.writeObject(humanList);
        objectOutputStream.close();
    }

    public void Read(String nameFile) {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameFile));
        List<T> restoredList = (List<T>) objectInputStream.readObject();
        objectInputStream.close();
    }
}
