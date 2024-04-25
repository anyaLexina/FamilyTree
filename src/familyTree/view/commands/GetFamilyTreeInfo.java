package src.familyTree.view.commands;

public class GetFamilyTreeInfo extends Command {
    public GetHumanInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список людей в дереве";
    }

    public void execute(){
        consoleUI.getHumanListInfo();
    }
}
}
