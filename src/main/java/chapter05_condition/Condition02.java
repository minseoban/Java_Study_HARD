package chapter05_condition;

import java.util.Scanner;

/*
    3. if - else if - else문 : if - else문과 달리 else if 에는 별도의 조건식이 요구됩니다.
        else if는 반복해서 나타날 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
    } else if (조건삭2) {
        실행문2
    } else of (조건식3) {
        실행문3
    } else {
        실행문4
 */
public class Condition02 {
    public static void main(String[] args) {
        // 1. Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 2. 사용할 변수(및 상수) 선언 및 초기화
        int point = 0;
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BRONZE = 20;

        System.out.println("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if (point > VIP) {
            System.out.println("회원의 등급 : VIP");
        } else if (point > GOLD) {
            System.out.println("회원의 등급 : GOLD");
        } else if (point > SILVER) {
            System.out.println("회원의 등급 : SILVER");
        } else if (point > BRONZE) {
            System.out.println("회원의 등급 : BRONZE");
        } else {
            System.out.println("회원의 등급 : 일반");
        }

        /*
            이전까지의 방식에서는
            System.out.println("회원 포인트를 입력하세요 >>> ");
            int point = scanner.nextInt();

            로, 처음 사용될 때 선언 및 초기화를 했었습니다.
            그런데, 왜 이번에는 저 위에 먼저 선언해놓고, 재대입하는 방식으로 작성했는가,

            다른 사람들과의 협업을 염두에 두고 사용되는 클래스 및 변수들을 초반부에 전부 선언한 뒤
            실제로 사용할 떄 재대입을 하는 방식으로 작성하는 것이 가독성을 염두에 둔 코드라고 할 수 있습니다.
         */

    }
}
