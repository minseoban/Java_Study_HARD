package chapter03_operator;

public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;
        System.out.println(i);

        // 대입 연산자 - "=" : = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 대입한다는 의미
        i = i + 1;          // 변수명 i에 10(기존 i에 대입되었던 데이터) + 1해서 재대입
        System.out.println(i);

        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        // 변수 선언 및 초기화
        int num = 1;
        System.out.println(num);
        num += 2;               // num = num + 2;
        System.out.println(num);
        num -=1;                // num = num - 1;
        System.out.println(num);
        num *= 10;              // num = num * 10;
        System.out.println(num);
        num /= 5;               // num = num / 5;
        System.out.println(num);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 출력값 : 10 변수명++ : 코드를 실행시킨 '후'에 j에 1을 더할 것
        System.out.println(j);      // 출력값 : 11
        System.out.println(++j);    // 출력값 : 12 ++변수명 : 코드를 실행시키기 '전'에 j에 1을 더할 것
        System.out.println(j);      // 출력값 : 12
        System.out.println(j--);    // 출력값 : 12 변수명-- : 코드를 실행시킨 '후'에 j에 1을 뺄 것
        System.out.println(j);      // 출력값 : 11
        System.out.println(--j);    // 출력값 : 10 --변수명 : 코드를 실행시키기 '전'에 j에 1을 뺼 것
        System.out.println(j);      // 출력값 : 10

        /*
            일반 수식 연산자
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자     -> 특정 숫자가 홀수인지 짝수인지를 구분할 때 많이 씀
         */

        System.out.println("10 / 2의 나머지 : " + 10%2);

    }
}
