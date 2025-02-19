package chapter14_casting.animals;

public class Dog extends Animal{

    // 상위 클래스 Animal의 메서드를 재정의
    @Override
    public void makeSound() {
        System.out.println("강아지가 짖습니다.");
    }

    // Dog만의 고유 클래스
    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }

}
