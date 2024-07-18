package CLI.V3.command;

import CLI.V3.Input;
import CLI.V3.domain.StudentScores;

// 2번 점수입력
public class GetScoresCommand  implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();
//        studentScores의 getScores()를 정수배열scores에 넣음.
//        public int[] getScores() {
//            return scores;
//        }
//        먼저 setStudentNum을 실행했다면
//        초기형태의 정수배열이 생성되었을 것이다.



        for(int i = 0; i < scores.length; i++) {
//            Input의 getInt함수를 scores.length번 실행 = i번 배열의 점수 입력.
            scores[i] = Input.getInt("scores ["+ i +"]>");
        }
    }
}
