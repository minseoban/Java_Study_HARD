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

 */

@Setter
@Getter

public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;



}
