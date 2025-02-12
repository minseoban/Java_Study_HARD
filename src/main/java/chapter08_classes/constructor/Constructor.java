package chapter08_classes.constructor;
/*
    생성자(Constructor) :
        생성자는 객체가 생성될 때 호출되는 '특별한' 메서드

    ClassExample example = new ClassExample();
    -> ClassExample 클래스의 객체를 생성 -> 객체 이름 : example
    까지는 저희가 수업한 내용에 해당합니다.
    사실은
    new ClassExample();이 생성자에 해당합니다.

    특징 :
        1. 클래스의 이름과 생성자 이름은 동일하다(즉, 다른 메서드들과 달리 대문자로 시작)
        2. return 값이 없다 -> call1(), call2() 유형이 떠올랐다면 성공적
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당함.

    생성자의 정의 방식 :
        1. 기본 생성자 : 매개변수가 없는 생성자(사실 클래스를 만들 떄 default로 생성되어 정의하지 않아도 될 때가 있음)
            ClassA, Car에서 기본 생성자를 정의하지 않고, ClassAMain에서, CarMain에서 객체를 생성했습니다 -> 복습하셔야 합니다.
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자 -> 이건 이제 수업 예정
 */
public class Constructor {
    // 필드(속성) 선언
    int num;
    String name;

    // 기본 생성자를 직접 작성해볼 예정 -> call1() 유형으로 작성이 되겠죠.
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 -> 기본적으로 만들어지지 않습니다 -> 개발자가 정의해야 함 -> call2() 유형
    Constructor(int num) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = num; // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨.
    }
    // 에를 들어 Constructor con1 = new Constructor(10);으로 했다면
    // this 부분이 con1으로 대체됨

    // 매개변수 생성자 -> 매개변수가 String name인 생성자를 만드시오.
    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }
    // 매개변수와 속성명이 일치할 필요는 없다.
    // 원래 예전에는 매개변수와 속성이 다르다는 점을 강조하기 위해 개발자들이 서로 헷갈리지 않도록
    // 매개변수명 =/= 속성명 으로 작성했으나
    // 자동완성을 지원하게 되면서 좀 신경을 덜 쓰는 경향이 있고,
    // 우리나라에서는 그냥 같이 쓰는게 일반적인 듯 함.

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(int, String 매개변수를 필수로 요구하는 생성자)");
        this.num = num;
        this.name = name;
    }

    Constructor(String name, int num) {     // 매개변수 순서가 다른 것은 다른 생성자로 간주함
        System.out.println("AllArgsConstructor(String, int 매개변수를 필수로 요구하는 생성자)");
        this.num = num;
        this.name = name;
    }

    // String name과, int num을 매개변수로 하는 AllArgsConstructor를 생성하시고,
    // ConstructorMain.java로 가서 constructor4를 '여러분 이름', '여러분 나이'로 생성한 다음,
    // sout을 통해 여러분 이름과 나이가 출력되도록 작성하시오.

    // constructor0에는 name에 "김일", 니이에 "10" 입력하고 sout을 통해 출력하시오.

    // int num과 String name을 매개변수로 하는 객체를 ConstructorMain.java에 생성하고,
    // 객체명을 constructor4로 생성하는데, num 30, name 김이로 대입하시오.
    // 그리고 sout을 통해 '김이 : 30'이 출력되도록 작성하시오.

    // 지금의 경우는 속성이 두 개 밖에 없기 때문에 객체 하나 당 조회를 두 번만 하면 되지만,
    // 속성 개수가 매우 많을 때를 대비하여 속성 전체를 확인할 수 있는 메서드를 정의할 예정.

    // 그리고 잘 생각해보면 지금 위에 있는 부분들은 전부 생성자와 속성과 관련된 부분이지
    // 행위를 나타내는 메서드를 정의하지 않았었습니다.

    // call1() 타입으로 작성
    void showInfo() {
        System.out.println("해당 객체의 num값 : " + num);
        System.out.println("해당 객체의 name값 : " + num);
    }

    // call3() 타입으로 작성해보세요. -> 매개변수는 x return이 있다. -> String이라고 작성했으니까 return 타입이 String
    String showInfo2() {
        return "해당 객체의 num값 : " + num + "\n해당 객체의 name 값 : " + name;
    }

}
