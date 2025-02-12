package chapter08_classes.score_calc;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        // 사용할 클래스들 import
        ScoreCalc scoreCalc = new ScoreCalc();
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수들 선언
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        double avgScore = 0;
        int totalSubs = 1;


        // 반복문 등등 작성
        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();

            if (score1 == -1) {
                break;
            }

            totalScore = scoreCalc.addScores(totalScore, score1);

            avgScore = scoreCalc.calculateAvg(totalScore, totalSubs);
            System.out.println("----- 점수 입력 시 마다 나오는 합계와 평균 ----- ");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);


            totalSubs++;
        }

        System.out.println("----- 최종 합계와 평균 -----");
        System.out.println("최종 점수의 합계 : " + totalScore);
        System.out.println("최종 점수의 평균 : " + avgScore);

//        double totalScore = scoreCalc.addScores(100, 100);
//        System.out.println(totalScore);
//
//        double avgScore = scoreCalc.calculateAvg(totalScore, 2);
//        System.out.println(avgScore);

        /*
            chapter07에 있는 ScoreCalc와 동일하게 기능하도록 작성하시오.
         */


    }
}
