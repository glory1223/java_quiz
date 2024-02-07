package ch02;

public class Quiz5 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        // char var4 = (char) strValue;  //String 타입을 기본타입들로 형변환하는것은 불가능하다.

        //String은 객체 즉 참조타입의 데이터 char타입은 기본타입이므로 형변환이 되지 않는다
    }
}
