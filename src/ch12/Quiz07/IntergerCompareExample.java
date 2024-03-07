package ch12.Quiz07;

public class IntergerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        //포장객체는 참조타입이 -128 ~127 사이는 값을비교한다. 그외는 주소를 비교
        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
    }
}
