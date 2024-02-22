package ch07.Quiz07;

public class Child extends Parent{
    public String name;

    public Child() { //부모생성자를 먼저 실행
        this("홍길동");  //this(매개변수: 홍길동) -> this같은클래스의 Child(string name) 생성자 실행
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
