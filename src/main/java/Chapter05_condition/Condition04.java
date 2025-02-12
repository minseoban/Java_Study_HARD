package Chapter05_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double height = 0;
//        double weight = 0;
//        int bmi =  0;
//
//        System.out.print("당신의 키(cm)를 입력하세요 >>> ");
//        height = scanner.nextDouble();
//        height = height / 100;
//
//        System.out.print("당신의 뭄무게(kg)를 입력하세요 >>> ");
//        weight = scanner.nextDouble();
//
//        bmi = (int)(weight / (height*height));
//
//        if (bmi > 25) {
//            System.out.println("당신의 bmi 지수는 " + bmi + "이고 비만입니다");
//        } else if (bmi > 23) {
//            System.out.println("당신의 bmi 지수는 " + bmi + "이고 과체중입니다");
//        } else if (bmi > 18) {
//            System.out.println("당신의 bmi 지수는 " + bmi + "이고 정상체중입니다");
//        } else if (bmi > 0) {
//            System.out.println("당신의 bmi 지수는 " + bmi + "이고 저체중입니다");
//        } else {
//            System.out.println("잘못입력되었습니다.");
//        }

        /*
                음수면 잘못입력되었습니다. 가 출력될 것.
                18 초과면 정상체중
                23 초과면 과체중
                25 초과면 비만
         */

        double height = 0;
        double weight = 0;
        int bmi =  0;
        String grade = "";

        System.out.print("당신의 키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble();
        height = height / 100;

        System.out.print("당신의 뭄무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        bmi = (int)(weight / (height*height));

        if (bmi < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if (bmi > 18) {
                grade = "정상체중";
            } else if (bmi > 23) {
                grade = "과체중";
            } else if (bmi > 25) {
                grade = "비만";
            } else {
                grade = "저체중";
            }
        }

        System.out.println("당신의 bmi지수는 " + bmi + "이고, " + grade + "입니다.");

        // String grade를 선언했을 때 생겨나는 문제점 중에 하나가 다음과 같은 상황입니다.

    }
}
