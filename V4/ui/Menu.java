package CLI.V4.ui;

import CLI.V4.Input;
import CLI.V4.command.Command;

public class Menu {
    // 메뉴들을 menuitem 객체로 만들어 관리해줌.
    MenuItem[] menus;

//    메뉴의 개수를 받아와 메뉴 리스트를 초기화 함.
    public Menu(int size) {
        menus = new MenuItem[size];
    }

//    메뉴 항목 주입
//    몇번째(ix)에 아이템을 주입할 것인지.
    public void add(int ix, MenuItem item) {
        menus[ix] = item;
    }
    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | ", i+1, menus[i].getTitle());
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
    }
    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
//        index로 접근해야 되기 때문에 사용자 입력값에서 -1로 해준다.
//        menus에서 menuitem 객체 하나를 접근해 command만 가져온다.
        return menus[selectNo-1].getCommand();
    }
}
