package CLI.V5;

import CLI.V5.command.*;
import CLI.V5.ui.Menu;
import CLI.V5.ui.MenuItem;


public class MyApp extends App {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(0, new MenuItem("학생수", new InitScoresCommand()));
        menu.add(1, new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(2, new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(3, new MenuItem("분석", new AnalizeCommand()));
        menu.add(4, new MenuItem("종료", new ExitCommand()));
    }

    public static void main(final String[] args) {
//        App은 추상클래스기 때문에 구현 클래스인 MyApp으로 객체를 생성해줘야 한다.
        App app = new MyApp();
//        템플릿으로 정해져 있는 메소드는 부모클래스에 구현한다.
//         => 템플릿 패턴
        app.init(5);
        app.run();
    }
}
