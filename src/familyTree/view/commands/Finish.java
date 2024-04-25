package src.familyTree.view.commands;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Закончить работу";
    }

    public void execute() {
        consoleUI.finish();
    }
}
