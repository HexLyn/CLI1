package CLI.V3.command;

// 5번 메뉴 종료기능 처리 클래스.
public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("프로그램 종료");
//        자바 프로그램 강제 종료 : System 클래스의 exit() 메소드
//        exit(0) -> 정상종료
//        exit(1) -> 강제종료
        System.exit(0);
    }
}
