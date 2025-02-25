package chapter17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person의 객체인 person1을 생성한다고 가정하겠습니다
//        Person person1 = new Person("어떤 필드 집어넣고 만들었겠지");
        // 이상의 코드는 현재 오류 발생합니다. 생성자를 다 없애기도 했고,
        // Builder 내부에 Person 객체를 생성하는 build()라는 메서드만 정의했습니다.

        Person person1 = new Person.Builder()
                .name("안민섭")
                .age(23)
                .address("부산광역시 강서구")
                .build();

        System.out.println(person1);

        Person person2 = new Person.Builder()
                .name("김이")
                .build();

        System.out.println(person2);

        Person person3 = new Person.Builder().build();

        Person person4 = new Person.Builder()
                .address("서울특별시 종로구")
                .age(20)
                .build();
    }
}
