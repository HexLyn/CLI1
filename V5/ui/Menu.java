package CLI.V5.ui;

<<<<<<< HEAD
import CLI.V5.Input;
import CLI.V5.command.Command;
=======
import CLI.V4.Input;
import CLI.V4.command.Command;
>>>>>>> f60a5d9e739133a5305d163fa823c89059a31ed5

public class Menu {
    MenuItem[] menus;
    public Menu(int size) {
        menus = new MenuItem[size];
    }

    public void add(int ix, MenuItem item) {
        menus[ix] = item;
    }

    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | ", i+1, menus[i].getTitle());
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
    }
    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        return menus[selectNo-1].getCommand();
    }
}
