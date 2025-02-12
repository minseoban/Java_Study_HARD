package Chapter08_classes.students;
/*
    1. Student 클래스의 필드를 정의하시오

        1) int studentCode
        2) String name
        3) double score

    2. 기본 생성자를 직접 작성하시고, 객체가 생성될 때
    "기본 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    3. int studentCode를 매개변수로 하는 매개변수 생성자를 생성하고,
    "int 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    4. String name을 매개변수로 하는 매개변수 생성자를 생성하고,
    "String 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    5. int studentCode, String name을 매개변수로 하는 매개변수 생성자를 생성하고,
    "int, String 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    6. StudentMain에서 해당 객체명과 속성을 가질 수 있도록 작성하시오,
        1) student1 2025001 / 김일 / 4.5      -> 기본 생성자로 생성할 것
        2) student2 2025002 / 김이 / 100      -> int 매개변수로 생성할 것
        3) student3 2025003 / 김삼 / 95.8     -> String 매개변수 생성자로 생성할 것
        4) student4 2025004 / 김사 / 4.0      -> int, String 매개변수 생성자로 생성할 것

    실행 예
    기본 생성자로 객체가 생성되었습니다
    int 매개변수 생성자로 객체가 생성되었습니다
    String 매개변수 생성자로 객체가 생성되었습니다
    int, String 매개변수 생성자로 객체가 생성되었습니다

    7. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1() 타입으로 정의하시오.
    실행 예
    학번 : 20250001
    이름 : 김일
    점수 : 4.5
 */
public class Student {
    // 필드(속성) 선언
    int studentCode;
    String name;
    double score;           //필드만 입력해도 기본생성자는 default로 만들어집니다

    // 기본 생성자 정의 -> 생성자는 클래스명과 동일하다.
    Student() {
        System.out.println("기본 생성자로 객체가 생성되었습니다");
    }

    // int studentCode 매개변수 생성자
    Student(int studentCode) {
        System.out.println( "int 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
    }

    // String name 매개변수 생성자
    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다");
        this.name = name;
    }
    // this의 의미는 객채명.속성명 에서 객체명 부분을 의미함 -> 아직 객체 생성전이기 때문에
    // 객체 이름을 대입할 수 없어서 this라는 임의적인 대명사를 사용.

    // int studentCode, String name 매개변수 생성자
    Student(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
    }

    void showInfo() {
        System.out.println("학번 : " + this.studentCode);
        System.out.println("이름 : " + this.name);
        System.out.println("점수 : " + this.score);
        System.out.println();
    }
    // 사실 위의 경우에도 특정 객체의 속성을 참조하는 것이기 때문에 가독성상 this를 입력해주는것이 매너이긴 합니다

}
