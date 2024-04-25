package src.familyTree.view.commands;

public class SortByName extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по возрасту";
    }

    public void execute() {
        consoleUI.sortByAge();
    }
}
