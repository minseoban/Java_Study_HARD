package chapter16_bean.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Data

public class PersonLombok {
    private final String name;
    private int age;

    /*
        Lombok 애너테이션을 사용하여 생성자 / getter / setter를 만들어줍니다.
        PersonMain으로 가서
        PersonLombok 클래스의 객체 person3를 생성하시고(name만 가지고 생성), 이름 - 여러분 이름 나이 - 여러분 나이
        toString() 메서드를 정의하여
        실행 예
        이름 : 여러분이름
        나이 : 여러분나이

        person4를 AllArgsConstructor를 활용하여 김사 19으로 생성하고
        객체 이름만으로 필드 정보를 출력하시오.

        로 출력될 수 있도록 하시오.
     */

    @Override
    public String toString() {
        return "이름 : " + name + "\n나이 : " + age;
    }

    /*
        @Data를 사용했을 경우
        @ToString이 포함돼있긴 하지만
        여러분들이 코드 하단에 toString()을 Override 받아 재정의했을 경우
        재정의한 toString()이 우선적으로 사용됩니다.
     */
}
