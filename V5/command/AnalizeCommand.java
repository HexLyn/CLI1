package CLI.V5.command;


<<<<<<< HEAD
import CLI.V5.command.Command;
import CLI.V5.domain.StudentScores;
=======
import CLI.V4.command.Command;
import CLI.V4.domain.StudentScores;
>>>>>>> f60a5d9e739133a5305d163fa823c89059a31ed5

public class AnalizeCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();
        int max =0;
        int sum=0;
        double avg=0;

        for(int i=0;i<scores.length;i++){
            max = (max<scores[i])? scores[i]: max;
            sum += scores[i];
        }
        avg = (double)sum/studentScores.getStudentNum();

        System.out.println("최고점수: " +max);
        System.out.println("평균점수: " +avg);
    }
}
