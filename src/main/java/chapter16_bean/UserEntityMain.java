package chapter16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        /*
            username에 1
            password 9876
            email a@test.com
            name에 여러분 이름을 입력한 뒤에
            toString()을 이용해 콘솔에 출력하시오.
         */

        userEntity1.setUsername(1);
        userEntity1.setPassword(9876);
        userEntity1.setEmail("a@test.com");
        userEntity1.setName("안민섭");

        System.out.println(userEntity1);

        // 롬복 적용한 부분을 처리하겠습니다.
        UserEntityLombok userEntity2 = new UserEntityLombok();

        userEntity2.setUsername(2);
        // 1234 / b@test.com / 김이
        userEntity2.setPassword(1234);
        userEntity2.setEmail("b@test.com");
        userEntity2.setName("김이");

        userEntity2.getUsername();
        userEntity2.getPassword();
        userEntity2.getEmail();
        userEntity2.getName();

        // getUsername ~ getName() 출력해보세요.

    }
}
