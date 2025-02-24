package chapter17_static.builders;

public class Person {

    // 필드 선언
    private String name;
    private int age;
    private String address;

    // command+n을 이용해서 생성자들을 전부 만들어 보겠습니다
    // 0 - 1 / 1 - 2 / 2- 3 / 3 - 1

    public Person() {
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int age, String address) {
        this.age = age;
        this.address = address;
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

git commit -m "feat: 20250224 singleton done / builder pattern started"