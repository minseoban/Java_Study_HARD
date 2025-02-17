package chapter12_inheritance.products;
/*
    1. field로 private String name, private String catergory를 선언
    2. 필드 둘 다 사용하는 생성자를 작성
        생성자 name / category 하나만 가지는 생성자를 2개 만드는 것은
        불가능합니다. Item("스트링자료형")을 argument로 받았다고 가정할 때
        컴퓨터는 "스트링자료형"을 name에 대입해야하는지 아니면
        category에 대입해야하는지 모르기 때문에.
    3. setter / getter 생성하시오.
    4. Product.java 로 가서 Item - 부모 클래스 / Product 자식 클래스가
        되게끔 명령어를 입력하세요.
 */
public class Item {
    private String name;
    private String category;


    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
