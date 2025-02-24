package chapter16_bean;

import lombok.Getter;
import lombok.Setter;
/*
    command + , / 상단에 IntelliJ IDEA -> Preferences

    좌측 부분 스크롤링해서 하단으로 내려가면 plugin에서 lombok -> 설치 -> enable

    chrome에 mvn이라고 검색하고 Maven Repository들어가서 lombok 검색하기.

    build system에 맞게 버전 선택하고 의존성을 추가하면 되는데,
    저희는 애초에 만들때 gradle로 만들었기 때문에 build.gradle에 있습니다.

    build.gradle에 의존성 부분에 추가를 하고 나서
    maven 경우에는 pom.xml에 dependencies에 추가하고 나서
    -> 코끼리 새로고침 해야합니다.

    20250224 수업 예정 내용 -> 그래서 롬복은 어디다가 / 왜 쓰는거고 / 어떤 기능이 있는지

    Lombok
        Java에서 반복적으로 작성해야하는 코드(boilerplate code)를 자동으로 생성해주는 라이브러리

        장점 :
            코드의 가독성을 높일 수 있다. -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
            특히 스크롤링해서 특정 필드의 setter가 있는지 없는지에 대해 고려할 필요없이
            @ 파트만 보더라도 대략적인 코드의 흐름을 알 수 있음.

        1. @Data
            - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualAndHashCode
            애너테이션을 전부 포함한 종합 패키지에 해당
        2. @NoArgsConstructor
            - 기본 생성자를 생성
        3. @RequiredArgsConstructor
            - final 또는 @NotNull로 지정된 필드를 매개변수로 받는 생성자를 생성
        4. @Getter / @Setter
            - 각 필드에 대해 getter / setter 메서드들을 생성
            - 클래스 레벨에 사용하면 모든 필드에 대해, 필드 레벨에 사용하면 특정 필드에 대해서만
                getter / setter가 생성됨 -> 저희는 지난 시간에 클래스레벨에만 적용했습니다.

            - 단, @Setter의 경우 final 필드에는 setter가 생성되지 않습니다.
                -> 이유는? 한 번 초기화하면 그 뒤로 다시 set할 수 없기 때문이겠죠.

        5. @EqualAndHashCode
            - equals()와 hashCode() 매서드들을 자동으로 생성 -> 둘이 세트로 만들어줘야하기 때문에 묶여있음

        6. @ToString
            - toString() 메서드들을 자동으로 생성
            - 객체의 필드값을 문자열로 표현해주는 메서드

        7. @AllArgsConstructor
            - 모든 필드를 포함하는 매개변수 생성자를 생성
            - @Data에 포함돼있지 않다는 점에 주의하셔야 합니다.
 */

@Setter
@Getter


public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;



}
