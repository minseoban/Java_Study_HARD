package chapter05_condition;

import java.util.Scanner;

/*
    switch문

    형식 :
    switch(변수)
        case 조건1:
            실행문1
            break;
        case 조건2:
            실행문2
            break;
        case 조건3:
            실행문3
            break;
        case 조건4:
            실행문4
            break;
        default:
            실행문5

        default의 의미 : case에 해당되지 않는 변수가 적용되었을 경우 실행되는 부분
        break의 의미 : 해당 조건문 / 반복문을 그 자리에서 종료시키는 명령어
 */
public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selected = null;     // "";로 초기화해도 됩니다.
        int selected2 = 0;

        System.out.println("메뉴를 선택하세요 >>> ");
//        selected = scanner.nextLine();
        selected2 = scanner.nextInt();
//        System.out.println("[ 선택 프로그램 ]");
//        System.out.println("a. 메뉴1");
//        System.out.println("b. 메뉴2");
//        System.out.println("c. 메뉴3");
//        System.out.println("d. 메뉴4");
//        System.out.println("e. 메뉴5");

        // 만약에 if문으로 작성한다면
//        if (selected == "a") {
//            System.out.println("메뉴1을 선택하셨습니다.");
//        } else if (selected.equals("b")){
//            System.out.println("메뉴2를 선택하셨습니다.");
//        }
        // 와 같이 가독성이 다 꺠져있습니다.

//        switch (selected) {
//            case "a":
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;
//            case "b":
//                System.out.println("메뉴2를 선택하셨습니다.");
//                break;
//            case "c":
//                System.out.println("메뉴3를 선택하셨습니다.");
//                break;
//            case "d":
//                System.out.println("메뉴4를 선택하셨습니다.");
//                break;
//            case "e":
//                System.out.println("메뉴5를 선택하셨습니다.");
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다.");
//        }

        // selected2를 기준으로 한 선택 프로그램 작성
        System.out.println("[ 선택 프로그램 ]");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");

        switch (selected2) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }



    }
}
