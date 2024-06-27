package CLI.V5.ui;

<<<<<<< HEAD
import CLI.V5.command.Command;
=======
import CLI.V4.command.Command;
>>>>>>> f60a5d9e739133a5305d163fa823c89059a31ed5

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
