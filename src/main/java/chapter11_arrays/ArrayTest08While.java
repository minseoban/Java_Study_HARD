package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    강사버전 참조하셔서 가장 상위의 for문을 while형태로 바꿔쓰고 정상적으로 작동하는지 확인하시오.
 */
public class ArrayTest08While {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6];
        int totalGame = 5;
        boolean duplicate;
        int number;

        System.out.println("while 로또 게임 시작");
        while(totalGame > 0 ) {
            for (int i = 0 ; i < lottoNumbers.length ; i++) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                for (int k = 0 ; k < i ; k++) {
                    if (lottoNumbers[k] == number) {
                        duplicate = true;
                    }
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));

            totalGame --;
        }



    }
}
