package chapter11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력

    이전 수업에서 sout(arr)을 이용하여 출력하게 되면 배열은 참조 변수이기 때문에 주소값만
    출력된다는 점을 확인했습니다. 그리고 반복문을 통해서 element를 불러올 수는 있지만
    배열 전체를 출력하는 방법은 이제 수업에서 배우게 됩니다.

    Arrays 클래스를 사용하고, 정적 메서드 .toString(배열명)을 사용하면 배열 전체를 출력할 수 있습니다.
    클래스명.메서드명()이라는 점에 주목하셔야합니다 -> scanner.next()와 좀 차이가 있는 상황
    toString()이라는 메서드도 추후에 사용할 메서드입니다.

    여기서 기억해야 할 점은
    동일한 method 명이라고 하더라도 어떤 클래스에 종속돼있는가에 따라서 다른 결과값을 가질 수
    있다는 점입니다.
    ex)
    random.nextInt() / scanner.nextInt()는 서로 다릅니다.
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int num = random.nextInt();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(num);
//        System.out.print("임의의 숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

        int[] arr01 = new int[10];

        for (int i = 0 ; i < arr01.length ; i++) {
            arr01[i] = (i+1);
            // element 출력
            System.out.print((i+1) + " ");
        }
        System.out.println();

        // enhanced for loop로 1 2 3 4 5 ... 10까지 출력하시오.
        for (int i : arr01) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 배열 전체 출력 방법
        System.out.println(Arrays.toString(arr01)); // 클래스명.toString() - argument로 배열명

        Integer[] arr02 = {4, 5, 2, 1, 9, 3, 6, 8, 7, 10};
        System.out.println("정렬 전 배열 : " + Arrays.toString(arr02));

        for (int num : arr02) {}

        // 오름 차순 배열
        Arrays.sort(arr02);     // 대부분의 경우 메서드를 사용하고 나면 그것을 변수에
                                // 대입해왔지만 sort()의 경우 arr02 자체의 순서를
                                // 전부 갈아버리기 때문에 인덱스 넘버에 따른 결과도 달라짐.
        System.out.println("오름 차순 배열 : " + Arrays.toString(arr02));

        // 내림 차순 배열
        Arrays.sort(arr02, Comparator.reverseOrder());
        // 오름 차순 시에 사용했던 sort()와 마찬가지로 배열 자체 순서를 전부 바꿉니다.
        System.out.println("내림 차순 배열 : " + Arrays.toString(arr02));
        // Comparator.reverseOrder() 메서드를 적용하기 위해서는 아까 빨간줄 떴을 때 T[]라는게
        // 있었는데 추후에 배우게 될 제네릭이라는 개념입니다.
        // T에 해당되는 것은 기본 자료형은 불가능하고, 클래스여야만 하기 때문에
        // int라는 기본 자료형으로 만들어진 arr02는 오류가 발생하여,
        // integer[] 형태로 교체하였습니다.

        double a = 1.2;
        Double b = 1.2;

        // 이상의 차이에 주목해서 앞으로 코드를 작성할 필요가 있습니다.
    }
}
