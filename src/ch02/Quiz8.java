package ch02;

public class Quiz8 {
    public static void main(String[] args) {
        int v1 = 1;
        System.out.println("v1:" + v1);


        if(true) {
            int v2 = 2;
            if(true) {
                int v3 = 2;
                System.out.println("v1:" + v1);
                System.out.println("v2:" + v2);
                System.out.println("v3:" + v3);
            }


            System.out.println("v1:" + v1);
            System.out.println("v2:" + v2);
//            System.out.println("v3:" + v3);   {}블록범위에 따른 올바르지 않은 변수사용
        }


        System.out.println("v1:" + v1);
//        System.out.println("v2:" + v2);   {}블록범위에 따른 올바르지 않은 변수사용

    }
}
