package chapter19_collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    }

}

