package src.familyTree.view;

import java.time.LocalDate;
import java.util.Scanner;

import src.familyTree.model.Human.Human;
import src.familyTree.presenter.Presenter;


public class ConsoleUI implements View {
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        hello();
        while (work) {
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("Приятно было пообщаться");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getFamilyTreeListInfo() {
        presenter.getFamilyTreeListInfo();
    }

    public void add() {
        String name = name();
        Gender gender = gender();
        LocalDate birthDate = birthDate();
        LocalDate deathDate = deathDate();
        scanner.nextLine();
        presenter.add(name, gender, birthDate, deathDate);
    }

    private void hello() {
        System.out.println("Доброго времени суток!");
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[0-9]+")) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand < menu.getSize()) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void inputError() {
        System.out.println(INPUT_ERROR);
    }

    private Gender gender() {
        System.out.println("Укажите гендер");
        System.out.println("1. мужской");
        System.out.println("2. женский");
        int genderNum = scanner.nextInt();
        scanner.nextLine();
        if (genderNum == 1)
            return Gender.Male;
        else
            return Gender.Female;
    }
    private LocalDate birthDate(){
        System.out.println("Введите год рождения: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        return birthDate;
    }
    private LocalDate daethDate(){
        System.out.println("Введите год смерти: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        LocalDate deathDate = LocalDate.of(year, month, day);
        return deathDate;
    }
    private String name(){
        System.out.println("Введите имя человека: ");
        String name = scanner.nextLine();
        return name;
    }
 
    public void addCildren(){
        System.out.println("Выбере, кому добавить ребенка");
        getFamilyTreeListInfo();
        System.out.println("Введите имя человека: ");
        String name = scanner.nextLine();
        Human human = presenter.getHuman(name);
        if(human != null){
            String newName = name();
            Gender gender = gender();
            LocalDate birthDate = birthDate();
            LocalDate deathDate = daethDate();
            presenter.addChild(human, newName, birthDate, birthDate);

        }
        else System.out.println("Человек не найден");
    }
    public void addParent(){
        System.out.println("Выбере, кому добавить родиетля");
        getFamilyTreeListInfo();
        System.out.println("Введите имя человека: ");
        String name = scanner.nextLine();
        Human human = presenter.getHuman(name);
        if(human != null){
            String newName = name();
            Gender gender = gender();
            LocalDate birthDate = birthDate();
            LocalDate deathDate = daethDate();
            presenter.addChild(human, newName, birthDate, birthDate);

        }
        else System.out.println("Человек не найден");
    }
}
