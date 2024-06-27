package CLI.V5.command;

<<<<<<< HEAD
import CLI.V5.command.Command;
=======
import CLI.V4.command.Command;
>>>>>>> f60a5d9e739133a5305d163fa823c89059a31ed5

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
