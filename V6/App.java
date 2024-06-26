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
        menu.add(new MenuItem("Terminate", new ExitCommand()));
    }

    public void createMenu(Menu menu) {
    }

    public void run() {
        init();
        while(true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }

}
