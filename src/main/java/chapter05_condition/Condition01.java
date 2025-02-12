package chapter05_condition;
/*
    조건문

    1. if문 : if 다음에 있는 () 내의 조건식이 true일 때, {} 내의 실행문이 실행됨. false면 안됨.

    형식 :
    if(조건식) {   조건식 : true / false로 결론이 날 수 있는 식 또는 문장
        실행문
    }

    2. if - else문 : if 다음에 있는 () 내의 조건식이 true일 때는 if에 종속된 {} 내의 실행문이 실행됨.
    false면 else에 종속뙨 {} 내의 실행문이 실행됨.

    형식 :
    if (조건식) {
        실행문1
    } else {        else의 경우 if가 false일 때만 실행되기 떄문에 별도의 조건식이 없음.
        실행문2
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        int num = -10;
//        // 1. if문 설명
//        if (num > 0) {
//            System.out.println("num은 양수입니다.");
//        }
          // 2. if-else문 설명
          if(num > 0) {
              System.out.println("num은 양수입니다.");
          } else {
              System.out.println("num은 0이거나 음수입니다.");
          }
    }
}
