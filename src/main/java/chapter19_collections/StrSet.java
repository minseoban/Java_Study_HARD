package chapter19_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복을 허용하지 않기 때문에
    List -> Set 혹은 Set -> List로의 형변환이 중요.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여 후보군을 남기는 방식으로
    많이 사용됨.
    또한 Set으로 중복을 제거한 후 .get(인덱스넘버)로 조회하는 방법 역시 가능
 */
public class StrSet {
    public static void main(String[] args) {
        // 사용할 변수 선언
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        // Set에 element 삽입하는 방법 -> .add()

        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("python");
        strSet.add("C#");
        strSet.add("1");
        strSet.add("2");
        strSet.add("2");
        strSet.add("3");
        strSet.add("3");
        strSet.add("3");

        // Set 출력 방법 -> 세트명으로 하시면 됩니다.
        System.out.println(strSet); // 순서를 보장하지 않습니다.

        // 특정 요소를 추출하는 것이 어렵다 -> List로의 형변환이 필요
        strList.addAll(strSet);
        System.out.println(strList);
        // strList에 값이 더해졌기 때문에 정렬을 하는 것이 가능하겠네요.
        Collections.sort(strList);  // 원본 list가 바뀝니다.
        System.out.println(strList);
        strSet.addAll(strList);     // List -> Set 바꾸는 과정 역시 동일합니다.
        System.out.println(strSet);

        strSet.toArray();
    }
}
