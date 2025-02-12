package chapter05_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

            score가 0보다 작거나 100보다 크면 grade는 x
            changedScore -> 9~10, grade = A
            changedScore -> 8, grade = B
            changedScore -> 7, grade = C
            changedScore -> 6, grade = D
            changedScore -> 5 이하, grade = F

            실행 예시
            점수를 일력하세요 >>> 100
            학점은 A 학점입니다.

            if문을 통해서 0미만과 100 초과를 걸러내는 작업 -> grade = "x";
            나머지 부분을 switch로 여러분이 직접 작성
         */
        // Scanner class import
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        int changedScore = score / 10;
        String grade = "";

        // 확인용 테스트 코드
//        System.out.println("changedScore : " + changedScore);

        // 점수 입력 및 변환이 끝났으므로 조건문 작성(if - switch 문을 혼합)
        if (score < 0 || score > 100) {
            grade = "x";
        } else {

            // 여기서 부터 switch문을 작성
            switch (changedScore) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");


    }
}
