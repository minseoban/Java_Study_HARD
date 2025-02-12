package Chapter05_condition;

import java.util.Scanner;

/*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

    score가 0보다 작거나 100보다 크면 grade는 x
    score -> 90 ~ 100, grade = A
    score -> 80 ~ 89, grade = B
    score -> 70 ~ 79, grade = C
    score -> 60 ~ 69, grade = D
    score -> 0 ~ 59, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    입력한 점수는 100 점이며, 학점은 A 학점입니다.

    점수를 입력하세요 >>> -20
    입력한 점수는 100 점이며, 학점은 x 학점입니다.
 */
public class Condition03 {
    public static void main(String[] args) {
        // 1. Scanner import
        Scanner scanner = new Scanner(System.in);

        // 2. 사용할 변수
        int score = 0;
        String grade = "";

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 3. 조건문 작성
        // # 1 : 조건문 마다 sout을 적용함 -> 조건에 해당하지 않으면 sout이 출력되지 않음
//        if (score < 0 || score > 100) {
//            System.out.println("당신의 점수는 " + score + "점이며, 학점은 x 학점입니다.");
//        } else {
//            if (score > 89) {
//                System.out.println("당신의 점수는 " + score + "점이며, 학점은 A 학점입니다.");
//            } else if (score > 79) {
//                System.out.println("당신의 점수는 " + score + "점이며, 학점은 B 학점입니다.");
//            } else if (score > 69) {
//                System.out.println("당신의 점수는 " + score + "점이며, 학점은 C 학점입니다.");
//            } else if (score > 59) {
//                System.out.println("당신의 점수는 " + score + "점이며, 학점은 D 학점입니다.");
//            } else {
//                System.out.println("당신의 점수는 " + score + "점이며, 학점은 F 학점입니다.");
//            }
//        }

        // # 2 : grade 변수 선언하여 대입 -> 조건문이 끝난 후에 sout을 적용하기 때문에 조건을 벗어나더라도 sout이 출력됨.
        // 조건문마다 sout이 있어서 가독성이 떨어지기 때문에 grade 변수를 선언하여 사용하는 방식
        if (score < 0 || score > 100) {
            grade = "x";
        } else {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "점이며, 학점은 " + grade + " 학점입니다.");
    }
}
