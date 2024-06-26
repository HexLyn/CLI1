package CLI.V6.command;

import CLI.V6.Input;
import CLI.V6.command.Command;
import CLI.V6.domain.StudentScores;

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
