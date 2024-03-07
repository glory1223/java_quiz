package ch14.Quiz02;

public class ThreadExample {
    // 스레드는 병렬관계로 각각의 스레드를 동시에 실행하지만 main스레드의 작업속도가 thread1보다 빠르다.
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("음악 듣는중");
        }
    }
}
