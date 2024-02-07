package ch02;

public class Quiz4 {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;
        int intValue2 = charValue;
        // short shortValue = charValue; 서로 값의 허용범위가 달라서 데이터손실이 일어날수 있음. 특히 char을 제외한 타입들은 최상위 부호비트를 음수를 표현하는데 사용함.
        double doubleValue = byteValue;


    }
}
