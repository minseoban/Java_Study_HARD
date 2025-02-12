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

        20250213에 수업 예정
        git add .
        git commit -m "feat: 20250212 array lesson"
        git push

 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        // 이상의 코드는 1부터 10까지를 저장하는 것 밖에 없는데 너무 코드블럭의 낭비가 심합니다.
        // 이를 해결하기 위한 배열의 선언 방식으로는

        int[] arr1 =  new int[5];       // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int[] arr2 = {1,2,3,4,5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

        System.out.println(arr1);
        System.out.println(arr2);
    }
}