package CLI.V5.command;

import CLI.V5.Input;
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;
import CLI.V5.Input;
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;

public class GetScoresCommand  implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for(int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores ["+ i +"]>");
        }
    }
}
