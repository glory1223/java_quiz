package ch13.Quiz03;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>( "홍길동" , 35 ); // K - String V - Integer
        Integer age = Util.getValue(pair, "홍길동" ); //key는 홍길동 // 클래스로접근(static)
        System.out.println(age);

    }
}
