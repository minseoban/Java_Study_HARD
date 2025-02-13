package chatper11_arrays;
/*
    배열의 필요성 :
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 int 변수를
        10개 선언해서 저장해야 했습니다.
        배열은 '같은' 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.
            -> 추후 다른 자료형을 하나의 변수에 저장하는 방식도 수업할 예정

        선언 방식 :
        자료형[] 변수명 =
        ex)
        int[] arr1 =  new int[5];       // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int[] arr2 = {1,2,3,4,5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

        sout(arr1)등을 통해서 출력해보면
        [I@36baf30c
        [I@7a81197d
        와 같은 식으로 @다음 주소값이 출력된다는 것을 확인할 수 있습니다.
        즉,
        {1,2,3,4,5}로 출력되지 않습니다.
        여기서 우리는 일반 변수와 참조 변수 개념에 대해서 학습해야만 합니다.

        일반 변수 : 데이터를 직접 가지는 변수
            byte, short, int, double 등 기본 데이터 타입(자료형)(primitive type)을 가지는 경우
        참조 변수 : 데아터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나
            변경하는 경우
            String, 배열, 객체(클래스), Collections -> Collections는 추후 수업 예정

 */
public class ArrayTest01 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int e = 5;
//        int f = 6;
//        int g = 7;
//        int h = 8;
//        int i = 9;
//        int j = 10;

        // 이상의 코드는 1부터 10까지를 저장하는 것 밖에 없는데 너무 코드블럭의 낭비가 심합니다.
        // 이를 해결하기 위한 배열의 선언 방식으로는

        int[] arr1 =  new int[5];       // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int[] arr2 = {1,2,3,4,5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

        System.out.println(arr1);
        System.out.println(arr2);

        // 문자열 데이터를 변수에 저장하는 방법
        String strExample1 = "안녕하세요";
        String strExample2 = new String("안녕하세요");
        System.out.println(strExample1);
        System.out.println(strExample2);

        if(strExample1 == "안녕하세요") {
            System.out.println("실행1");
        }

        if(strExample2 == "안녕하세요") {
            System.out.println("실행2");
        }

        // 그래서 문자열을 비교할 때는
        if(strExample2.equals("안녕하세요")) {
            System.out.println("실행3");
        }

        // 참조 변수의 예시라고 볼 수 있겠습니다

        int[] arr03 = {10, 20, 30, 40};

        System.out.println(arr03[0]);   // 10 [] 내에 있는 숫자를 index라고 하고 0부터 시작
        System.out.println(arr03[1]);   // 20
        System.out.println(arr03[2]);   // 30
        System.out.println(arr03[3]);   // 40   // 이 각 10~40까지를 element라고 합니다

        // 이상의 코드를 봤을 때 sout 실행문이 반복되는 것처럼 보입니다. -> 반복문 적용이 가능

        int[] arr04 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // 1. 반복문을 사용하여 각 요소를 출력하는데 10 9 8 7 6 ... 1로 출력할 수 있도록 하시오.
        // 수업할 enhanced for loop
        for (int number : arr04) {
            System.out.print(number + " ");
        }
        System.out.println();
        // 2. 그리고 1 2 3 4 5 ... 10으로 출력할 수 있도록 하시오.
        for (int i = 9; i > -1; i--) {
            System.out.print(arr04[i] + " ");
        }
        // 3. 그리고 11 10 9 8 7 ... 2로 출력될 수 있도록 하시오.
        System.out.println();
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print(arr04[i] + 1 + " ");
        }

        // 3번 과제에서 확인할 수 있듯이 각 element들은 그 자료형에 따라 수학적인 연산 혹은
        // 기타 다른 작업을 할 수 있습니다.
        System.out.println();
        arr04[0] += 1;

        System.out.println(arr04[0]);

    }
}