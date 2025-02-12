package chapter06_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean isEmpty = false;

        // while의 () 내부에는 조건식이 들어가기 때문에 결과값 혹은 자료형이 boolean이기만 하면 됨.
        while(!isEmpty) {           // !는 not의 의미를 지니고 있어서 조건식 부분에서 자주 쓰임
            System.out.print("n에 들어갈 값을 입력하세요. >>> ");
            n = scanner.nextInt();

            if(n == 0) {
//                isEmpty = true;
                break;
            }

            System.out.println("n의 값 : " + n);
        }
        /*
            이상의 while 반복문에서 확인할 수 있는 점 :
                break; 명령어와 isEmpty 변수는 반복문을 종료시켜준다는 공통점이 있음.
                하지만, 작동 방식이 다릅니다.

                1) break;
                    : break;가 실행되는 즉시 while 반복문이 종료되어 break; 밑에 있는
                        코드들을 실행시키 않고 종료

                2) isEmpty
                    : 변수의 데이터는 true->false / false->true로 바뀌었지만
                        while(조건식)을 적용하는 시점까지 나머지 반복실행문을 전부 실행시키고
                        조건을 검토하는 단계에서 전체 반복문 종료

                        이까지 작성하셨으면
                        chapter07_methods 패키지 생성
                        Method01 클래스 생성

         */
    }
}