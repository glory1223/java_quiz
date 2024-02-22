package ch07.Quiz07;

public class Parent {
    public String nation;

    public Parent() {
        this("대한민국"); // this (매개변수:대한민국) -> this같은클래스에있는 parent(string nation) 생성자 실행
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
