package src.familyTree.view.commands;

public class SortByAge extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по имени";
    }

    public void execute() {
        consoleUI.sortByName();
    }
}
