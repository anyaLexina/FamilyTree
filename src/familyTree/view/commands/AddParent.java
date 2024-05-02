public class AddParent extends Command{
    AddParent(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Добавить родителей";
    }
    public void execute(){
        addParent();
    } 
}
