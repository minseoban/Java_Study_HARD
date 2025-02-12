package Chapter07_methods;

import java.util.Scanner;

/*
    별찍기 관련한 부분을 메서드로 만들어 볼 예정.
 */
public class Method02 {
    // 메서드를 정의할 부분 -> call4()
    public static String getStar(int rows, int select) {    // rows와 rowOfStars를 매칭 시킬 계획
        // 사용할 지역 변수 선언
        String result ="";

        // select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 예정
        if(select == 1) {
            // 왼쪽으로 치우친 증가하는 별
            for (int i = 0 ; i < rows ; i++) {
                for (int j = 0 ; j < i + 1 ; j++) {
                    result+= "*";
                }
                result += "\n";
            }
        } else if (select == 2) {
            // 오른쪽으로 증가하는 별찍기
            for (int i = 0 ; i < rows ; i++) {
                // 공백 삽입
                for (int j = 0 ; j < rows - i - 1 ; j++) {
                    result += " ";      // 혹시 공백 깨져보이면 공백 하나 더 주세요.
                }
                // 별 찍기
                for (int k = 0 ; k < i + 1 ; k++) {
                    result += "*";
                }
                result += "\n";
            }

        } else if (select == 3) {
            // 왼쪽으로 감소하는 별찍기
            for (int i = 0 ; i < rows ; i++) {
                for (int j = 0 ; j < rows - i ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 4) {
            // 오른쪽으로 감소하는 별찍기
            for (int i = 0 ; i < rows ; i++) {
                // 공백
                for (int j = 0 ; j < i ; j++) {
                    result += " ";
                }
                // 별찍기
                for (int k = 0 ; k < rows - i ; k++) {
                    result += "*";
                }
                // 개행
                result += "\n";
            }
        } else {
            System.out.println("입력 오류입니다.");
        }



        return result;
    }

    //메서드를 호출할 부분
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;
        String starResult;

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("매뉴를 숫자로 선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
    }
}
