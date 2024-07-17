package CLI.V4.ui;

import CLI.V4.command.Command;

// 따로 관리되던 메뉴명과 Command를 하나의 클래스로 캡슐화 했다.
public class MenuItem {
    String title;
    Command command;

    public MenuItem(String title, Command command) {
        this.title = title;
        this.command = command;
    }
    public String getTitle() {
        return title;
    }
    public Command getCommand() {
        return command;
    }
}
