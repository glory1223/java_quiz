package ch02;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("1"+ "2"); // → (12)
        System.out.println('A' + 'B' );//char형 + char형 = int형으로 자동 타입변환이 일어난다. (131)
        System.out.println('1' + 2); // → ( 51) char형 1의 유니코드 값49 char형 + int형  = int형으로 자동 타입변환이 일어난다,
        System.out.println('1' + '2');// → (99 ) char형 2의 유니코드 값 50
        System.out.println('J' + "ava");// → (Java ) //String + 다른타입 = 항상 문자열로 인식

    }
}
