package CLI.V6.ui;

import CLI.V6.Input;
import CLI.V6.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //더 작은 MenuItem을 List로 업 캐스팅 해준다.
//    menus가 인터페이스 이므로 List로 줄 수 없다. ArrayList는 클래스라 가능.
    List<MenuItem> menus;
//    List는 인터페이스기 때문에 실제 객체 생성은 ArrayList로 해준다.
//    ArrayList는 크기를 미리 지정해줄 필요가 없다.
    public Menu() {
        menus = new ArrayList<>();
    }

//    ArrayList는 add를 통해 가장 마지막 부분에 요소 추가가 가능.
    public void add(MenuItem item) {
        menus.add(item);
    }

    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
//        배열의 length대신 ArrayList의 size()사용 가능.
        for (int i = 0; i < menus.size(); i++) {
//            배열의 menus[i] 대신 ArrayList의 get(i) 사용가능.
            System.out.printf("%d.%s | ", i+1, menus.get(i).getTitle());
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
    }
    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        return menus.get(selectNo-1).getCommand();
    }
}
