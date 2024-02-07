package ch02;

public class Quiz6 {
    public static void main(String[] args) {
        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5;

        // byte result1 = byteValue + byteValue; //정수타입끼리의 int타입으로 변환이되어 연산됨. 변수타입을 int로 바꿔줘야한다
        int result2 = 5 + byteValue; // int + byte = int형으로 자동타입변환
        float result3 = 5 + floatValue;//int + float = float형으로 자동타입변환 (허용범위가 큰쪽으로 타입변환이 일어난다고 생각하자.)
        double result4 = 5 + doubleValue; // int + double = double타입으로 자동타입변환

    }
}
