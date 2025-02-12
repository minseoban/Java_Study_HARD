package chapter08_classes.students;
/*
    생성자를 자동 생성하는 방법

    code(코드) -> generate(생성)으로 들어가서 constructor(생성자) 클릭
    단축키 : command + n

    어떤 필드(속성)를 기준으로 생성자를 만들지 선택하시면 됩니다.(아무것도 선택하지 않으면(select none/선택 안함),
    복수 선택시에는 복수의 매개변수를 가진 매개변수 생성자
 */
public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본생성자");
    }

    public Student2(int studentCode) {
        System.out.println("매개변수 생성자");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }
}
