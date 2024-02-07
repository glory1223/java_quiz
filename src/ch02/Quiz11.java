package ch02;

public class Quiz11 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        i = (int)ch; //char형은 int보다 허용범위가작으므로 자동타입변환이 발생하기때문에 생략할수있음.
//        생략이 안되는것들은 허용되는 값의 범위가 다르기 때문에 데이터 손실이 발생할수있어서 자동 형변환이 불가하다.

    }
}
