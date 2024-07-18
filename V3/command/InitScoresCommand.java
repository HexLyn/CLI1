package CLI.V3.command;

import CLI.V3.Input;
import CLI.V3.domain.StudentScores;

// 1번 학생 수
public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생 수> ");
        studentScores.setStudentNum(studentNum);
//        getInt로 값을 입력받고,
//        입력받은 값만큼의 길이의 정수배열을 setStudentNum으로 생성.
    }
}
