package chapter16_bean.persons;

public class Person {
    // 필드 선언
    // 접근 지정자와 자료형 사이에 final을 명시하는 경우

    // 이하의 코드는 그래도 뒀을 경우 빨간줄이 뜨는데 해결방법이 두 가지가 있습니다.
    // 1. name에 값을 대입해 상수를 초기화 하는 법 (그런경우 NAME으로 표기하죠)
    // 2. final이 붙은 변수를 필수적으로 포함하는 매개변수 생성자를 만들 것
    private final String name;
    private int age;

    // 필수적인 필드를 포함한 RequiredArgsConstructor를 생성
    public Person(String name) {
        this.name = name;
    }

    // 필수 필드 및 옵션 필드를 전부 포함한 생성자 -> AllArgsConstructor에 해당
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 여러분들은 setter / getter를 만드시오 (롬복 사용 하지 말고)


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n나이 : " + age;
    }
}
