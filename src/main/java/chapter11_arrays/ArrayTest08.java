package chatper11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    로또 번호 추첨기를 프로그래밍할 예정입니다.

    1. 1 - 45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 예정
    2. 5번의 게임을 할 겁니다.
        - 로또 한 게임을 기준으로 할 때 6개의 번호를 뽑는 것을 5 게임할 예정
    3. nextInt()를 통해서 번호를 뽑게 되면 중복 번호가 생길 수 있습니다.
        -> getter / setter와 같은 파트에서 중복 제거와 관련된 로직을 확인 가능
    4. 배열 완성 후 오름차순을 통해서 숫자들을 정렬하여 출력합니다.

    실행 예
    로또 번호 추첨기에 오신 것을 환영합니다.

    이번 로또 당첨 번호는 다음과 같습니다.
        [ 3, 12, 25, 13, 24, 21 ]
        [ 3, 25, 7, 4, 6, 8 ]
        [ 4, 15, 22, 30, 36, 41 ]
        [ 7, 8, 19,  21, 34, 42 ]
        [ 5, 6, 14, 18, 27, 33 ]
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        // 랜덤 클래스 import
        Random random = new Random();
//        int a = random.nextInt(45);        // random.nextInt(한계값) -> 0 ~ (한계값-1)까지의 int값을 반환
//        System.out.println(a); // 0 ~ 44까지 튀어나온다는 의미겠네요
//        int b = random.nextInt(46); // 이 경우 0번이 나올 수도 있겠네요

        int[] lottoNumbers = new int[6];
        int num = 0;

        // 로또 코드가 한줄만 나오는 상황
//        for (int i = 0 ; i < lottoNumbers.length ; i++) {
//                lottoNumbers[i] = random.nextInt(45) + 1;              // num의 초기값이 0이기 때문에 1 더하고 대입
//        }
//        System.out.println(Arrays.toString(lottoNumbers));

        // 위의 코드를 5번 반복하기 위해 정리된 코드
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < lottoNumbers.length ; j++) {
                lottoNumbers[j] = random.nextInt(45) + 1;
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }

        // 중복 제거를 위한 변수 선언
        boolean duplicate = false;

            git commit -m "feat : 20250214 lotto game removing duplicated numbers"
    }
}