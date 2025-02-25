package chapter17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder().build();
        person1.setName("김일");
        person1.setAge(19);
        person1.setAddress("부산광역시 부산진구");


        System.out.println(person1);

        /*
            PersonLombok에 setter / getter를 정의하여
            "김일" / 19 / "부산광역시 부산진구"를 적용하여
            sout을 다시 사용하여 정보를 출력하시오.

            person2를 생성하고 이름 - 김이 만 입력하고 객체를 생성하시오 -> setter 이용 / 89 / 경상남도 양산시
            - 하고 출력
            person3 이름 김삼 나이 21만 입력하고 객체를 생성하시오 -> setter 이용 / 광주광역시 북구
            - 하고 출력
            person4 김사 / 39 / 서울특별시 마포구로 객체를 생성하시오.
            - 하고 출력
         */

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        person2.setAge(89);
        person2.setAddress("경상남도 양산시");
        System.out.println(person2);

        PersonLombok person3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();

        person3.setAddress("광주광역시 북구");
        System.out.println(person3);

        PersonLombok person4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울특별시 마포구")
                .build();

        System.out.println(person4);

    }
}
