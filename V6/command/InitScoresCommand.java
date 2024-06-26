package CLI.V6.command;

import CLI.V6.Input;
import CLI.V6.command.Command;
import CLI.V6.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생 수> ");
        studentScores.setStudentNum(studentNum);
    }
}
