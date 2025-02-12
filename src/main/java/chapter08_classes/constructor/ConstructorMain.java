package chapter08_classes.constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 인스턴스 생성
        Constructor constructor0 = new Constructor();

        // 매개변수 생성자를 통한 인스턴스 생성
        Constructor constructor1 = new Constructor(38);

        // 객체인 constructor0의 속성에 값을 대입하는 방법
        constructor1.name = "안근수";

        System.out.println(constructor1.name);
        System.out.println(constructor1.num);

        Constructor constructor2 = new Constructor("안근수");
        constructor2.num = 20;
        System.out.println(constructor2.name);
        System.out.println(constructor2.num);

        constructor0.name = "김일";
        constructor0.num = 10;
        System.out.println(constructor0.name);
        System.out.println(constructor0.num);

        Constructor constructor3 = new Constructor("여러분이름",3);
        System.out.println(constructor3.name);
        System.out.println(constructor3.num);

        Constructor constructor4 = new Constructor(30, "김이");
        System.out.println(constructor4.name + " : " + constructor4.num);

        constructor0.showInfo();
        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();

        System.out.println();

        System.out.println(constructor0.showInfo2());
        System.out.println(constructor1.showInfo2());
        System.out.println(constructor2.showInfo2());
        System.out.println(constructor3.showInfo2());
        System.out.println(constructor4.showInfo2());




    }
}
