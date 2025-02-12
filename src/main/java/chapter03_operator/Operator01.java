package chapter03_operator;
/*
    논리 연산자

    true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자료형

    AND(&&) : 곱연산자라고도 함 T x T = T / T x F = F / F x F = F -> 하나라도 false라면 false
    OR(||) : 합연산자라고도 함 T + T = T / T + F = T / F + F = F -> 하나라도 true면 true
    NOT(|) : 값을 반대로 바꿔준다. 혹은 틀릴 경우를 나타냄 -> 추후 수업 예정
    boolean flag = false;
    sout(!flag)     +> true 출력돰
 */
public class Operator01 {
    public static void main(String[] args) {
            boolean flag = false;
            System.out.println(!flag);

        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println(" T x T = " + result1);

        boolean result2 = flag1 && flag2;
        System.out.println(" T x F = " + result2);

        boolean result3 = flag2 && flag2;
        System.out.println(" F x F = " + result2);

        // OR 연산자 예시들
        boolean result4 = flag1 || flag1;
        System.out.println(" T + T = " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println(" T + F = " + result5);

        boolean result6 = flag2 || flag1;
        System.out.println(" F + F = " +result6);

        // 응용

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(" T + T x T = " + result7);

        boolean result8 = 10 % 3 == 0;        // "="는 대입연산자고, a와 b가 같다 라고 쓸 때는 a == b로 작성합니다.
        System.out.println("10 % 3 == 0 ? :" + result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10 % 3 !=0 ? : " + result9);


    }
}
