package chapter20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    JSON(JavaScript Object Notation) : 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만, 언어 독립형 데이터 포멧
    프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는 자바, 파이썬 등 다양한 언어에서 쉽게 이용 가능


    {
            "이름공간(key)": "값(value)",
            "값 구분자": "각각의 값들은 ','(콤마)로 구분되어야 합니다.",
            "이스케이프": "키가 값에서 큰따옴표를 쓰고 싶으면-특정 문자를 이스케이프 하려면- \" 처럼 문자 앞에 역슬래시를 붙입니다.",
            "자료형": "표현 가능한 자료형은 String, int, double, boolean, null, object, array 6개 입니다.",
            "문자열 값": "큰따옴표로 감싸서 표현됨 - 자바와 같음.",
            "숫자": 123456, // 큰따옴표 없이 표현됨
            "boolean 값": true,
            "null 값": null,
            "object 값": {
                "값1": 123456789,
                "값2": false,
                "값3": {
                    "객체 내부": "객체 위치 가능",
                    "구분자": "key-value 구분은 ':'(콜론)으로 이루어집니다."
                }
            },
            "Arrray 값": [
                "여기에 String을 넣고 싶다면 다시 ""를 써야합니다.",
                {
                    "현재 값의 인덱스": 1,
                    "해당 방식처럼": "배열 안에 여러 값을 넣는 것도 가능"
                },
                [ "배열", "내부에", "배열을", "삽입하는 것도", "가능합니다."]
            ],
            "JSON 예시": "마무리"
    }

        GSON : Google JSON의 약칭 -> 자바에서 생성한 객체를 매개변수로 넣으면 GSON 객체를 생성해 tojson() 메서드를 사용,
        Map으로 매칭시킨 데이터들을 JSON String으로 반환해줍니다. 즉, json 포맷으로 일일이 작성해야하는 번거로움을 줄여줍니다.

        mvn -> Maven Repository에서 Gson 검색 -> version 클릭 -> (현재 저희 프로젝트 기준으로) Gralde(short) 클릭
        -> 복사한 후에 build.gradle파일의 dependencies의 가장 밑에 붙여넣기 -> 파란색 코끼리 꼭 눌러야 합니다.

        JsonObject jsonObject = new JsonObject(); 했을 때 빨간줄 뜨면 import class를 통해서 import 문이 상단에 뜨는 것을
        확인하시면 됩니다. 안 뜰 경우 alt + enter로 불러올 수 있습니다.

 */
public class JSON1 {
    public static void main(String[] args) {
        // JsonObject 클래스의 jsonObject 객체를 생성
        JsonObject jsonObject = new JsonObject();

        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty() 메서드를 사용
        jsonObject.addProperty("username", "geunsu");
        jsonObject.addProperty("password", 1234);
        jsonObject.addProperty("email", "maybeags@gmail");
        jsonObject.addProperty("name", "안근수");

        // JSON 객체 출력
        System.out.println(jsonObject);
        // {"username":"geunsu","password":1234,"email":"maybeags@gmail","name":"안근수"}
        // Map과의 차이점을 봤을 때
        // 1. Map에서는 key 부분에 ""가 없었던 반면에
        //  Json에서는 모든 키가 String 자료형처럼 보이도록 ""가 있습니다.
        // 2. Map에서는 key1=value1의 형태로 작성되어있었던 반면에
        //  Json에서는 key1:value1의 형태로 작성되어있습니다.

        jsonObject.addProperty("age", 38);
        jsonObject.addProperty("job", "자바 강사");

        System.out.println(jsonObject);

        // 컴퓨터가 콘솔에 출력한 형태는 가독성이 떨어지는 경우가 있으므로
        // 추가적인 class를 import 해와서 가독성을 증진시킨 방식으로 출력하는 것을
        // prettyPrinting이라는 표현을 보통 씁니다.
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // jsonObject를 prettyPrinting이 적용된 JSON '문자열' 형태로 반환
        String json = gson.toJson(jsonObject);

        System.out.println(json);

        /*
            Gson 라이브러리 :
                목적 : Gson 라이브러리는 Java 객체를 JSON 형태로 변환하거나,
                    그 반대로 변환하는데 사용
                주요 클래스
                    Gson : 변환을 위해(json <-> Java 객체) 주로 사용되는 클래스
                    GsonBuilder : Gson 인스턴스에 대한 사용자 정의 구성을 허용(prettyPrinting 등)
                    JsonObject : JSON '객체'를 나타냄
         */
    }
}