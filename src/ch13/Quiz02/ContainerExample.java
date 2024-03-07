package ch13.Quiz02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");

        String name1 = container1.getKind();
        String job = container1.getModel();
        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);

        String name2 = container2.getKind();
        int age = container2.getModel();
    }
}
