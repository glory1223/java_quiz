package ch03;

public class Quiz11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b; // byte c = (byte) (a+b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3 / 2.0f; //정수 연산의 결과는 정수이기에 소수점과 f를 붙여 소수점까지 연산결과를 얻어야한다.
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;

        double d = 0.1;
        boolean result = (float)d==f2; //double과 float은 연산시 반드시 타입을 맞춰줘야한다. 부동소수점 때문에

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

    }
}
