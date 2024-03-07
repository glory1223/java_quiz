package ch14.Quiz04;

public class Music extends Thread {
    Thread thread = new Thread() {
        @Override
        public void run() {
            for(int i=0;i<3;i++) {
                System.out.println("동영상을 재생합니다.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }

};

}
