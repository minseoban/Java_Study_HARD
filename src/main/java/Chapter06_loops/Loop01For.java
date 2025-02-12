package Chapter06_loops;
/*
    반복문 :
        for 반복문
            1) 일반 for문
            2) 향상된 for문(enhanced for-loop)
        while 반복문
 */
public class Loop01For {
    public static void main(String[] args) {
        /*
            for 반복문
                : 대부분의 경우에는 명확한 횟수가 고정되어 있을 떄 사용함.


                형식 :
                for( 시작값 ; 종료값 ; 증감값 ) {
                    반복실행문
                }
         */
//        for (int i = 1 ; i < 11 ; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0 ; i < 10 ; i++) {
//            System.out.println(i+1);
//        }

        int sum = 0 ;

        /*
            1부터 100까지의 합을 구하시오.
         */

        // 반복문 작성

        for (int i = 1 ; i < 101 ; i++) {
             sum += i;
        }

        System.out.println("1부터 100까지의 합 : " + sum);

    }
}
