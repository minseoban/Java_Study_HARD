package chapter17_static.builders;

import lombok.ToString;

/*
    1. 빌더 패턴(Builder Pattern)이란?
        빌더 패턴은 객체의 생성 과정에서 '복잡한 생성자'를 대신하여 객체를 단계적으로
        생성할 수 있도록 도와주는 디자인 패턴. GOF(Gang Of Four) 디자인 패턴 중
        하나로, 객체 생성시 가독성과 유연성을 제공하는 것이 목표.

    주요 특징 :
        1) 객체를 생성하는 여러 개의 필드를 '명시적'으로 관리할 수 있음.
        2) 불필요한 생성자 오버로딩을 줄여 가독성을 높임(기본생성자/필드1만 포함하는 생성자/
            필드만2만 포함하는 매개변수 생성자 / 필드 1,2를 다 포함하는 매개변수 생성자)
        3) 체이닝 메서드를 사용하여 객체를 직관적으로 생성

    2. 빌더 패턴이 생기게 된 원인
        1) 복잡한 생성자 문제
            객체의 필드가 많아질 수록 생성자의 파라미터 수도 늘어남
        2) 생성자 오버로딩 문제 - 생성자에 필요한 조합이 다를 경우 수많은 생성자를 만들어야 함.
            -> 유지보수에 악영향 / 필드 하나 추가하면 생성자를 싸그리 다 고쳐야한다는 문제
        3) 가독성과 유지 보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지가
            명확하지 않아 실수를 유발할 수 있음

    -> 이상을 이유로 빌더 패턴의 개념이 생겨났습니다.


 */
@ToString
public class Person {

    // 필드 선언
    private String name;
    private int age;
    private String address;
//
//    // command+n을 이용해서 생성자들을 전부 만들어 보겠습니다
//    // 0 - 1 / 1 - 2 / 2- 3 / 3 - 1
//
//    public Person() {
//    }
//    public Person(int age) {
//        this.age = age;
//    }
//    public Person(String name) {
//        this.name = name;
//    }
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public Person(int age, String address) {
//        this.age = age;
//        this.address = address;
//    }
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
    // -> 이게 너무 길고 번거로워서 빌더 패턴이 생겨났습니다.
    // 여기서부터 빌더 패턴의 구성을 위한 코드 작성합니다.

    private Person(Builder builder) {       // 접근 지정자가 private이기 때문에 객체 생성 불가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    // 이상의 코드를 봤을 때 Builder 클래스의 객체인 builder의 인스턴스 변수인
    // name, age, address를 Person 객체인 인스턴스 변수 name, age, address에 대입하는 구조

    // 객체를 생성하는 Main 단계에서 Builder를 통해 Person 객체를 생성할 것이기 때문에 public
    public static class Builder {
        // Builder 클래스의 필드 선언
        // 상위 클래스의 필드와 동일해야 함.
        private String name;
        private int age;
        private String address;

        // Builder 클래스의 메서드 정의
        // 여기서 중요한 점이 method명인데 제가 수업할 때 method명은 동사라고 이야기 했지만
        // 여기서는 Person의 필드 명과 동일하게 작성할 에정입니다.
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 최종 Person 객체 생성 메서드
        public Person build() {
            return new Person(this);
        }

    }



}
