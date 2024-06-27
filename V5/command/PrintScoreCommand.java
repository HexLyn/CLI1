package CLI.V5.command;


<<<<<<< HEAD
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;
=======
import CLI.V4.command.Command;
import CLI.V4.domain.StudentScores;
>>>>>>> f60a5d9e739133a5305d163fa823c89059a31ed5

public class PrintScoreCommand  implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for(int i = 0; i < scores.length; i++) {
            System.out.println("scores ["+ i + "]: "+ scores[i]);
        }
    }
}