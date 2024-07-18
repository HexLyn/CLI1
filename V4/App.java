package CLI.V4;

import CLI.V4.command.*;
import CLI.V4.ui.*;

// V4의 변화
// 1. 메뉴를 주입(injection)을 통해 구성
// 2. MenuItem 클래스로 메뉴 타이틀과 Command를 캡슐화


public class App {
    Menu menu;

    public App() {
    }

//    초기화 메서드
//    menuSize를 받아오고 있다.
    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu) {
//        menuitem은 title, command가 필요하다.
//        add는 ix와 item이 필요하다.
//        => menuitem 배열의 해당 인덱스에 메뉴 이름과 command를 묶어서 추가해준다.
        menu.add(0, new MenuItem("학생수", new InitScoresCommand()));
        menu.add(1, new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(2, new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(3, new MenuItem("분석", new AnalizeCommand()));
        menu.add(4, new MenuItem("종료", new ExitCommand()));
    }

    public void run() {
        init(5);
        while (true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

