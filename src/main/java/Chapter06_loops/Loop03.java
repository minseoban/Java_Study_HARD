package Chapter06_loops;
/*
    중첩 for문(Nested for-loop) :
    형식 :
    for( int i = 0 ; 1 < 10 ; i++ ) {
        반복실행문1
        for( int j = 0 ; j <10 ; j++ ) {
           반복실행문2
       }
       반복실행문3
 */
public class Loop03 {
    public static void main(String[] args) {
        //사용할 변수 선언
//        int a;
//        int b;
//
//        for ( int i = 0 ; i < 5 ; i++ ) {
//            a = i;                                   // a의 값 초기화
//            System.out.println("a의 값 : " + a);      // 반복실행문1에 해당
//            for (int j = 0 ; j < 5 ; j++) {
//                b = j;                               // b의 값 초기화
//                System.out.println("b의 값 : " + b);  // 반복실행문2에 해당
//            }
//            System.out.println("----b가 끝나서 새로 a를 대입합니다----");   // 반복실행문3에 해당
//         }

        /*
            실행 예

            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 8 = 72
            9 x 9 = 81
         */

        for ( int i = 2 ; i < 10 ; i++) {
            for (int j = 1 ; j < 10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }


    }
}
