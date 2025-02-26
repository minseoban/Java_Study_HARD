package chapter19_collections;

import java.util.*;

/*
    컬렉션(Collection)은 여러 객체를 모아놓은 것을 의미함.
    종류 :
        1. List : 순서가 있는 데이터의 집합으로, 중복된 요소를 허용함.
            - ArrayList : 배열 기반의 리스트, 요소 접근 속도가 빠름.
            - LinkedList : 연결 리스트의 리스트, 삽입 / 삭제 속도가 빠름.

        2. Set : 중복을 허용하지 않는 데이터들의 집합
            - HashSet : 해시 테이블 기반의 집합, 요소의 순서를 보장하지 않음.
            - TreeSet : 이진(binary) 검색 트리 기반의 집합, 요소가 정렬된 상태로 유지됨.

        3. Map : 키(Key)와 값(Value)의 쌍으로 이루어진 데이터의 집합.
            - HashMap : 해시 테이블 기반의 맵, 키의 순서를 보장하지 않음.
            - TreeMap : 이진 검색 트리 기반의 맵, 키가 정렬된 상태로 유지됨.
 */
public class StrList {
    public static void main(String[] args) {
        // ArrayList 생성 및 초기화
        List<String> strList = new ArrayList<>();
        int[] intArray = new int[3];

        // 배열과의 비교
        intArray[0] = 1;

        // List의 데이터 삽입
        strList.add("java");        // 배열과 달리 메서드를 통해서 집어넣습니다.
        strList.add("python");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList);        // 얘는 toString()이 정의돼있습니다.

        // List의 출력 - Arrays 같은 식 말고 객체명으로 출력이 가능

        // 특정 element(리스트 내의) 검색 -> .contains() 메서드를 이용
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("element명을 입력하세요 >>> ");
//        String searchElem = scanner.nextLine();
//
//        boolean contains = strList.contains(searchElem);
//        System.out.println(searchElem + " 포함 여부 : " + contains);

        // element의 String 데이터 중 일부만 자른 검색 결과를 확인
        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);  // 3형식 문장으로 생각하시면 됩니다.
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);
        // 정확하게는 문자열 자제를 검색해서 확인하는 것이 아니라, 해당 List 내부의 요소를 전체 확인
        // 하는 것이기 때문에 element의 일부인 문자열로는 포함 여부 확인이 불가능

        // 특정 element 삭제 -> .remove()
        String removeElem = "C#";
        boolean removed = strList.remove(removeElem);
        System.out.println(removeElem + " 삭제 여부 : " + removed); // true
        System.out.println(strList);    // [java, python, JavaScript, Kotlin]

        // 마찬가지로 .remove() 역시 element 전체가 일치하는지를 확인하고 삭제를 수행하기 때문에
        // element의 일부 데이터만 가지고 삭제를 진행할 수 없습니다.

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removeElem2 + " 삭제 여부 : " + removed2); // false
        System.out.println(strList); // [java, python, JavaScript, Kotlin]

        // List 정렬 -> Collections.sort(strList);
        Collections.sort(strList);      // 배열과 유사하게 원본의 정렬을 바꿉니다 -> 변수 대입 할 필요 x
        System.out.println("정렬된 List : " + strList);
        // 정렬된 List : [JavaScript, Kotlin, java, python]

        // List 역순 정렬 -> Collections.reverseOrder() -> 배열과 완전히 동일
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역순 정렬된 List : " + strList);
        // 역순 정렬된 List : [python, java, Kotlin, JavaScript]

        // List의 특정 element 출력
        System.out.println(strList.get(0));

        // 리스트 각 요소 전체 출력하시오.

        // 일반 for문 -> Array의 경우에는 배열명.length이지만 List는 리스트명.size()
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println(strList.get(i));
        }

        // strList.size() 사용한 일반 for문
//        for (int i = 0 ; i < strList.size() ; i++) {
//            System.out.println(strList.get(i));
//        }

        // 향상된 for문
        for (String strElem : strList) {
            System.out.println(strElem);
        }


    }

}

