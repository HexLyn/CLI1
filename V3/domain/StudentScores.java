package CLI.V3.domain;

public class StudentScores {
    int studentNum =0;
    int[] scores = null;

//    Singleton 패턴
    private StudentScores() {}

    private static StudentScores instance = new StudentScores();
    //      => instance는 StudentScores 클래스의 유일한 인스턴스를 참조하는 정적 필드.
    //          클래스가 로드될 때 자동으로 생성된다.
    public static StudentScores getInstance() {
        return instance;
    }
    // getInstance()메서드를 외부에서 호출하면 StudentScores의 인스턴스에 접근할 수 있다.
    // 인스턴스를 생성하지 않고 이미 생성된 인스턴스를 반환하므로, 여러번 호출해도
    //    같은 인스턴스를 반환.


    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
//        initScoresCommand에서  studentNum 입력, 해당 값만큼 길이를 가진
//        scores 정수배열이 생성됨. 초기 형태는 [0,0,...,0] n의 길이만큼 기본값 0으로 채워짐.
        this.scores = new int[studentNum];
    }
    public int[] getScores() {
        return scores;
    }
}
