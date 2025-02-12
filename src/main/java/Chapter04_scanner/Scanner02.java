package Chapter04_scanner;

    import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            문자열 입력
            scanner.next()      -> 띄어쓰기 포함 x
            scanner.nextLine()  -> 띄어쓰기 포함 o
         */
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
//        System.out.println("당신의 이름을 입력하세여 >>> ");
//        String name = scanner.nextLine();
//        System.out.println("당신의 이름은 " + name + "입니다.");

        /*
            실행 예

            이름을 입력하세요 >>> 여러분이름
            주소를 입력하세요 >>> 여러분 주소(시 / 구까지 혹은 도 / 시 까지)
            나이를 입력하세요 >>> 여러분나이

            이름 : 여러분 이름
            주소 : 여러분 주소
            나이 : 여러분 나이
            내년 나이 : 여러분 나이 + 1(age에 20 대입했다면 21이 나와야 합니다)

            //질문이 먼저 나오고, 뒤에 변수명 = 데이터 대입이 이루어져야합니다.
            name, address, age로 고정시키겠습니다.
         */
        // 프롬프트 작성
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.print("주소를 입력하세요 >>> ");
//        String address = scanner.nextLine();
        /*
            현재 이대로 작성을 했을 경우에 35-38 라인 사이에서 예상대로 실행되지 않습니다.
            nextLine()은 (띄어쓰기를 허용하는데) enter 키를 기준으로 입력문을 받아들입니다.
            36라인의 nextInt() 작성후에 enter를 때려버리면 38라인에서 enter가 자기건줄 알고
            그래도 소하해버려서 아무 값도 입력되지 않게 됩니다.

            문제를 해결하기 위한 방식을 아래에 작성합니다.
         */
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
        scanner.nextLine();  // 50번 라인에서의 엔터기를 막아주는 배리어 역할
        // -> 변수에 대입하지 않았으므로 저장되지 않음
        System.out.print("주소를 입력하세요 >>> ");
        String address = scanner.nextLine();

        System.out.println();
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//        System.out.println("주소 : " + address);
//        System.out.println("내년 나이 : " + (age+1));
        // \n : 다음줄로 강제 개행해주는 명령어
        System.out.println("이름 : " + name + "\n주소 : " + address + "\n나이 : " + age + "\n내년나이 : " + (age+1));

        /*
            next() vs. nextLine()
                1. 입력 단위 : next()는 공백 이전까지의 단어를 읽고(띄어씌기 불가),
                    nextLine()은 줄바꿈 이전까지의 전체 문자열을 읽는다(enter키 기준).
                2. 1.로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓰게 될 때,
                    nextLine()을 호춣하기 전에 next()를 먼저 사용하게 되면, next() 입력하고 난 후에 친
                    enter키로 인해 nextLine()이 입력을 무시하고 다음 코드라인을 읽어들이면서 빈 문자열만 저장,
                    변수애 아무 것도 대입되지 않을 수 있음.
                3. 해결 방안 : 2.는 java 상에서의 대표적인 scanner 관련 문제로, 이를 막기 위해 enter키를
                    흡수해주는 배리어를 코드라인으로 삽입할 필요가 있음.
         */
    }
}
