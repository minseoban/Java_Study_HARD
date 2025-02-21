package chapter15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        // teacher1의 객체의 클래스 정보 얻기
        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        // 결과값 : class chapter15_objects.teacher.Teacher

        System.out.println(teacher1);
        // 결과값 : Teacher{name='안근수', schoolName='코리아아이티'}
        // 이유는? toString()을 재정의해서 override

        System.out.println(teacher1.getClass().getSimpleName());
        System.out.println(tClass.getSimpleName());
        // 결과값 : Teacher

        // 클래스의 모든 필드(Field) 정보를 출력하는 반복문
        Field[] fields = tClass.getDeclaredFields();
//        System.out.println(fields);   -> 배열이니까 출력이 안되겠죠
//        for (int i = 0 ; i < fields.length ; i++) {
//            System.out.println("필드명 출력 " + fields[i].getName());
//            System.out.println("패키지 + 클래스명 출력 : " + fields[i].getType());
//            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
//        }
        System.out.println();
        // 향상된 for문으로 작성하시오.
        for (Field field: fields) {
            System.out.println("필드명 출력 " + field.getName());
            System.out.println("패키지 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());

        }

        System.out.println();
        // 클래스의 모든 메서드(Method) 정보를 출력하는 반복문
        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0 ; i < methods.length ; i++) {
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType());
        }

        System.out.println();
        // 향상된 for문으로 작성하시오.
        for (Method method: methods) {
            System.out.println("메서드 명 출력 : " + method.getName());
            System.out.println("리턴 타입 출력 : " + method.getReturnType());
        }

        // fields와 methods 배열을 요소 말고 그대로 배열 전체를 출력하시오.
        // Arrays.toString()
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(methods));
        // 당연히 fields와 methods가 배열로 선언되었으니 당연히 여러분들은
        // Arrays.toString() 떠올리셨으면 좋겠습니다.
        // 각 내부 요소들의 패키지 경로까지 전부 다 출력되기 때문에
        // 이상의 getName() 등의 메서드를 통해 반복문으로 작성해야 했습니다(가독성 문제)

        // .equals()
        System.out.println(teacher1.getClass() == teacher2.getClass()); // true
        System.out.println(teacher1 instanceof Teacher); // true

        chapter15_objects.Teacher teacher3 = new chapter15_objects.Teacher("안근수", "코리아아이티");
        // teacher3의 경우에는 Teacher 클래스의 인스턴스이기는 하지만 패키지 경로가 다릅니다.
        // 근데 우리는 일단 두 Teacher 클래스에 동일한 코드 라인을 작성했습니다.

//        System.out.println(teacher3 instanceof Teacher);
        // teacher3의 경우 다른 경로의 Teacher 클래스의 인스턴스이기 때문에 오류가 발생했습니다.

        System.out.println(teacher1.equals(teacher2));  // true : 내부의 값이 동일한가
        System.out.println(teacher1 == teacher2);   // false : 저장된 주소지가 같은가

//        System.out.println(teacher3.getClass() == Teacher.class);   // 오류 발생


    }
}
