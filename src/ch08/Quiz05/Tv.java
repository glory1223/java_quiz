package ch08.Quiz05;

public class Tv implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("Tv를 켰습니다");
    }

    public static void main(String[] args) {
        Tv r = new Tv();
        r.powerOn();
    }
}


