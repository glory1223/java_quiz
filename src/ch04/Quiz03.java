package ch04;

public class Quiz03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number =1; number <=20; number++) {
            if (number % 2 != 0 && number % 3 != 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
