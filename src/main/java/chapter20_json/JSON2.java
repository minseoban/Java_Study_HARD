package chapter20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 일반 Gson / GsonBuilder 비교
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 사용할 변수 선언 -> Json 결과값은 String이라는 거 꼭 명심하셔야 합니다.
        String userJson = null;

        // user1 객체를 생성하고 "kim1", "9876", "a@test.com", "김일", "20"로 생성하시오.
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");

        // gson을 통한 JSON 데이터로 변경
        System.out.println(gson.toJson(user1));

        // gsonBuilder를 통한 prettyPrinting 적용이 된 JSON 데이터로 변경(출력만 차이나고 똑같습니다)
        System.out.println(gsonBuilder.toJson(user1));

        // gsonBuilder를 통한 JSON 데이터를 java의 String 변수에 집어넣으면
        userJson = gsonBuilder.toJson(user1);
        // 정상 실행이 됐다는 말은 gsonBuilder.toJson(user1)의 결과값의 자료형이 String이라는 의미겠죠.

        // 이상의 방법은 좀 명시적이고 직접적으로 알아보기 위한 방식으로는 instanceof를 사용할 수 있습니다.

        boolean result1 = (gsonBuilder.toJson(user1) instanceof String);
        boolean result2 = (userJson instanceof String);
        System.out.println("결과값 : " + result1);
        System.out.println("결과값 : " + result2);

        // 이상의 코드들은 동어반복적이지만 수업을 위해 남겨두겠습니다.

        // 이상까지의 코드들은 보니까 User라는 클래스를 정의해놓고 거기에 맴버 변수에 값을 대입해서
        // JSON 데이터로 바꾼 듯 보입니다.

        // 그렇다면 JsonObject는 뭐였을까요?

        // 클래스로 정의하지 않은 객체를 생성해보겠습니다

        JsonObject jsonObject = new JsonObject();   // 임시적으로 클래스 역할을 할 jsonObject 객체 생성
        jsonObject.addProperty("학번", 20250001);
        jsonObject.addProperty("학과", "영어교육과");
        jsonObject.addProperty("성적", 'A');

        System.out.println(jsonObject);
        System.out.println(gson.toJson(jsonObject));
        System.out.println(gsonBuilder.toJson(jsonObject));

        // key 명칭들을 보니까 대충 student 관련한 객체로 보이지만,
        // 직접적으로 클래스명을 정의한 적이 없다는 점이 User를 통한 json data 변경과의 차이점이라고 할 수 있습니다.
    }
}

