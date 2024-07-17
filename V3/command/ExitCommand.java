package CLI.V3.command;

// 5번 메뉴 종료기능 처리 클래스.
public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
