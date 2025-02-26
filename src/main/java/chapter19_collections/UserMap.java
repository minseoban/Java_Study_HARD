package chapter19_collections;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        // username에 geunsu
        // password에 1234
        // email에 maybeags@gmail.com
        // name에 안근수를 각각 key와 value로 하여 Map에 집어넣으시오.

        userMap.put("username", "geunsu");
        userMap.put("password", "1234");
        userMap.put("email", "maybeags@gmail.com");
        userMap.put("name", "안근수");

        System.out.println(userMap);

        // userMap의 key 값들을 Set으로 받아오시오.
        //Set 선언하고 key와 같은 자료형을 제네릭에 명시할 것
        Set<String> keySet = userMap.keySet();
        System.out.println(keySet);

        // 여기에 keySet을 List로 바꾸면 순서가 있지 않을까.
        List<String> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);    // 이제는 인덱스 넘버가 있습니다.
        // username, password, email, name
        String keyName1 = keyList.get(3);
        String keyName2 = keyList.get(0);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(1);

        // 순서를 고정시킨 List 생성
        List<String> keyList2 = new ArrayList<>();
        keyList2.add(keyName1);
        keyList2.add(keyName2);
        keyList2.add(keyName3);
        keyList2.add(keyName4);



        // 순서에 맞는 value들을 대입
        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);

        // Value들만 모아둔 List를 생성
        List<String> valueList = new ArrayList<>();

        valueList.add(value1);
        valueList.add(value2);
        valueList.add(value3);
        valueList.add(value4);

        // key가 처음에 map 만들었을 때의 순서, value 처음 map 만들었을 때의 순서가 된
        // 두 개의 리스트를 출력
        System.out.println(keyList2);
        System.out.println(valueList);

        // chapter20_json
        // JSON1.java






    }
}