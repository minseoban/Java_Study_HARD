package chapter06_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }

    while 뒤에 나오는 소괄호 안의 영역인 조건식을 보면
    if(조건식) 형태와 유사함을 확인할 수 있습니다.

    즉, while() 내에 있는 조건식이 true일 때 {} 내의 영역이 반복 실행됩니다.
F
 */
public class Loop06While {
    public static void main(String[] args) {
//        int n = 1;
//        while(n < 101) {
//            System.out.println(n);
//            n++;        // 해당 코드가 없으면 무한 루프에 빠지게 됨.
//        }
        /*
            그래서 for 문을 쓸 때와 달리 while문을 작성할 때의 유의할 점으로는 :

                for문은 한계값을 for() 내에 작성하지만,
                while문은 그렇지 않기 때문에
                특정 시점에 조건식이 false가 되게끔 개발자가 사전에
                염두할 필요성이 있음.
         */

        // 1 부터 5까지의 합을 구하는 for문과 while문을 작성하시오.
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for (int i = 0 ; i < 5 ; i++) {
//            sum1 += i+1;
//        }
//
//        System.out.println("for 문을 통한 합 : " + sum1);

//        int n = 1;
//        while(n < 6) {
//            sum2 += n;
//            n++;
//        }
//
//        System.out.println("while문을 통한 합 : " + sum2);


        /*
                1 2 3 4 5 6 7 8 9 10
                11 12 13 14 15 16 17 18 19 20
                21 22 23 24 25 26 27 28 29 30
                ...
                91 92 93 94 95 96 97 98 99 100

                나는 반복문을 10번 반복할 것인가 혹은 100번 반복할 것인가.
         */

        // 반복이 100번 이루어짐
//        for (int i = 1 ; i < 101 ; i++ ) {
//            System.out.print(i + " ");
//            if(i % 10 == 0) {
//                System.out.println();
//            }
//        }

        // 반복이 10번 이루어짐
//        for (int i = 1 ; i < 101 ; i = i+10) {
//            System.out.println("" + i + "  " + (i+1) + "  " + (i+2) + "  " + (i+3) + "  " + (i+4) + "  " + (i+5) + "  " + (i+6) + "  " + (i+7) + "  " + (i+8) + "  " + (i+9));
//        }

        int n = 1;
        while(n < 101) {
            System.out.print(n + " ");
            if(n % 10 == 0) {
                System.out.println();
            }
            n++;
        }

    }

}