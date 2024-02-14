package ch04;

public class Quiz04 {
    public static void main(String[] args) {
        while(true){
            int num1 = (int) (Math.random() * 6) + 1; //1~6까지의  숫자를 랜덤하게 구해줍니다.

            int num2 = (int) (Math.random() * 6) + 1; //1~6까지의   숫자를 랜덤하게 구해줍니다.

                    // 이 부분에서 (값1, 값2) 형태로 출력하세요.
            System.out.println("주사위 값1: " + num1);
            System.out.println("주사위 값2: " + num2);
                    // 값의 합이 5가 아니면 계속 주사위를 던지고, 값의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
            int sum = num1 + num2;

            switch (sum) {
                case 5:
                    System.out.println("주사위의합이 5입니다.");
                break;
                default:
                    continue;
            }
            System.out.println("프로그램 종료");
            break;
        }

    }
}
