package CLI.V6;

import CLI.V6.command.*;
import CLI.V6.ui.Menu;
import CLI.V6.ui.MenuItem;

public abstract class App {
    Menu menu;

    public App() {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
//        종료는 모든 프로그램에 포함되어 있어야 하기때문에 init에 빼놓았다.
        menu.add(new MenuItem("Terminate", new ExitCommand()));
    }

    public void createMenu(Menu menu) {
    }

    public void run() {
//    ArrayList로 변하면서 초기에 크기를 지정해줄 필요가 없어짐.
        init();
        while(true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }

}
