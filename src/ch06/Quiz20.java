package ch06;

public class Quiz20 {
    //isNumber() 메소드 작성
  static  boolean isNumber(String str) {
        if (str == null || str.equals("")) return false;
        else {
            for (int i = 0; i < str.length(); i++) {
                if ( str.charAt(i) < '0' || str.charAt(i) > '9') return false; //charAt은 char타입으로 값을 받아온다.
            }
      return true;
        }
  }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str)); //객체를 생성하지 않고 메소드를 바로쓴다면 static메소드
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }

}
