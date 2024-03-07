package ch12;

public class Quiz10 {
    /*
10. Class 객체에 대한 설명 중 틀린 것은 무엇입니까?

➊ Class.forName( ) 메소드 또는 객체의 getClass ( ) 메소드로 얻을 수 있다.
➋ 패키지와 클래스 이름을 알 수 있다.
➌ 클래스의 생성자, 필드, 메소드에 대한 정보를 알아낼 수 있다.
➍ getResource ( ) 메소드는 프로젝트 경로를 기준으로 리소스의 URL을 리턴한다. -> getResource()메소드는 절대경로 기준으로 URL을 리턴한다.

     */

    /*
    //class객체를 생성하는 3가지 방법
        // 첫번째 방법
        Class clazz = Car.class;
        //두번째 방법
        Class clazz2 = Class.forName("ch12.sec11.exam01.Car");
        //세번째 방법
        Car car = new Car();
        Class clazz3 = car.getClass();
     */
}
