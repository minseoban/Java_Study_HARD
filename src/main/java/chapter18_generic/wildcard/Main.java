package chapter18_generic.wildcard;
/*
    와일드카드(Wildcard)
        : 와일드카드는 제네릭 타입을 좀 더 유연하게 사용할 수 있도록 보조하는 역할
            표기 방식 -> '?'
        1. 상한 경계 와일드 카드
            <? extends T> : T의 하위 타입만 허용
        2. 하한 경계 와일드 카드
            <? super T> : T의 상위 타입만 허용
 */
public class Main {

    public AnimalData<? extends Animal> getAnimal(int flag) {
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;    // Human도 아니고 Tiger도 아니면 null 반환
    }

    public static void main(String[] args) {
//        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
//        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
//        // 15번 라인에서 오류가 발생하지 않습니다. -> 제네릭은 어떤 클래스든 들어갈 수 있기 때문에
//
//        animalData1.printData();
//        animalData2.printData();
//        animalData3.printData();    // 얘는 Car를 Animal로 형변환하려고 하니까 오류 발생
//        // 여기서 문제점은 꼭 printData() 메서드를 호출해봐야 오류가 발생한다는 것을 인지할 수 있다는 점.
        // 이상의 코드는 와일드 카드 적용 전에 해당합니다.

        // Main 클래스의 객체 생성
        Main main = new Main();

        AnimalData<? extends Animal> animalData3 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData4 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(3);
        // 이상의 코드는 Main에 있는 getAnimal() 메서드를 통해서 간접적으로 Human 객체 및
        // Animal 객체를 생성하는 과정이라고 볼 수 있겠습니다.

        if (animalData3 != null) {
            animalData3.printData();
        }
        if (animalData4 != null) {
            animalData4.printData();
        }
        if (animalData5 != null) {
            animalData5.printData();
        } else {
            System.out.println("animalData5는 null입니다.");
        }

    }
}
