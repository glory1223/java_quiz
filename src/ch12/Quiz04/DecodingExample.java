package ch12.Quiz04;

public class DecodingExample {
    public static void main(String[] args) {
        byte[] bytes = {-20, -107, -120, -21, -123, -107}; //보안을 위해 인코딩함 네트워크 전송을위해이용됨.
        String str =  new String(bytes);
        System.out.println("str: " + str);
    }
}
