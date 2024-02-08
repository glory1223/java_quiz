package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((lengthTop + lengthBottom) * height / 2.0);
        System.out.println(area); //1, 2, 3 (정수끼리의 연산은 정수가되므로 실수와 연산을 하던가 강제타입변환후 연산을 해야됨.


    }
}
