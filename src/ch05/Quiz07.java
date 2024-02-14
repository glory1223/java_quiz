package ch05;

public class Quiz07 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int arrObj : arr) {
            sum += arrObj;
        }
        System.out.println(sum);
    }
}
