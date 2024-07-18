package CLI.V3;

public class Menu {
    String menus [] = {"학생 수", "점수 입력","점수리스트","분석","종료"};
// menus라는 문자열 배열을 만들고, 메뉴 선택 요소들의 이름을 저장한다.

    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | ", i+1, menus[i]);
        }
//        for문을 돌리며 %d.%s의 형식으로 i+1, menus[i]를 출력.
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");}

    public int getSelect() {
        int selectNo = Input.getInt("선택> ");
//        Input 파일의 getInt로 정수를 입력받아 selectNo에 저장,
//        selectNo 반환.
        return selectNo;
    }
}
