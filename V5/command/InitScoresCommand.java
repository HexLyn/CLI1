package CLI.V5.command;

import CLI.V5.Input;
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;
import CLI.V5.Input;
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생 수> ");
        studentScores.setStudentNum(studentNum);
    }
}
