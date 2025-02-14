package chapter11_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    현재까지 배운 대부분의 Java 클래스

    Scanner
    Arrays
    Integer
    Double
    Comparator
    String
    Random

    지시 사항

    배열 이름은 numbers[]

    1. index가 10개인 배열을 만들고 Math.random()을 활용하여 값을 집어넣으시오.
        : 1 이상 10 이하의 int 배열로 만들어서.

    2. 값이 입력된 배열을 출력
        1) 배열 전체 출력
        2) 각 요소에 10씩 곱해서 한 줄에 출력

    3. 해당 배열의 합의 크기를 구할 것

    4. 짝수만 출력해서 합을 구할 것

    5. 배열을 오름 차순으로 정렬해서 출력

    6. 내림 차순으로 정렬해서 출력
 */
public class ArrayTest05 {
    public static void main(String[] args) {
//        double a = Math.random();       // 0.0 초과 1.0 미만의 난수를 생성해서 반환

        Integer numbers[] = new Integer[10];
        int sum = 0;
        int sumEven = 0;
        System.out.print("10씩 곱한 결과 : [ ");
//        numbers[0] = (int)(Math.random()*10) + 1;       // 1 부터 10까지의 임의의 정수
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = (int)(Math.random()*10) + 1;
            // 10 곱한 elements 출력
            System.out.print((numbers[i]*10) + " ");
            // 전체 합 구하기(10 곱하기 전
            sum += numbers[i];
            // 짝수 합 구하기
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        System.out.println("]");
        System.out.println("numbers 요소의 합 : " + sum);
        System.out.println("numbers 요소 중 짝수의 합 : " + sumEven);

        // 배열 오름 차순 정렬
        Arrays.sort(numbers);
        System.out.println("오름 차순 정렬 : " + Arrays.toString(numbers));
        // 배열 내림 차순 정렬
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 : " + Arrays.toString(numbers));




    }
}
