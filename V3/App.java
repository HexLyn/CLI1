package CLI.V3;

import CLI.V3.command.*;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
        // 생성자에서 Menu로 객체 생성해서 초기화
        menu = new Menu();
        commands = new Command[] {
//                커맨드 객체들.
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand()
        };
    }
//    executeCommand : 만들어둔 메소드들을 사용자의 입력값에 따라 호출
    public void executeCommand(int selectNo) {
//        인덱스로 접근하기 때문에 사용자 입력한 값에서 -1 해준다.
        Command command = commands[selectNo-1];
//        가져온 커맨드의 execute가 실행된다.
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
