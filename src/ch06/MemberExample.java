package ch06;

public class MemberExample {
    public static void main(String[] args) {
        Member user1 = new Member ("홍길동", "hong", "1234", 3);
        System.out.println(user1.name);
        System.out.println(user1.id);
        System.out.println(user1.password);
        System.out.println(user1.age);
    }
}
