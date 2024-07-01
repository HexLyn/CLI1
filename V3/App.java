package CLI.V3;

import CLI.V3.command.*;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
        menu = new Menu();
        commands = new Command[] {
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand()
        };
    }
    public void executeCommand(int selectNo) {
        Command command = commands[selectNo-1];
        command.execute();
    }
    public void run() {
        while(true) {
            menu.printMenu();
//            getSelect는 int를 반환하는 메소드기 때문에 바로 받아와서 처리
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }

public static void main(String[] args) {
    App app = new App();
    app.run();
}
}
