package ch13.Quiz01;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");

        String str = container1.getKind();

        Container<Integer> container2 = new Container<Integer>();
        container2.setKind(6);

        int value = container2.getKind();
    }
}
