package src.familyTree.view.commands;

public class AddHuman extends Command {
    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить человека";
    }

    public void execute() {
        consoleUI.addHuman();
    }
}
