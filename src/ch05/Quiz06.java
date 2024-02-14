package ch05;

public class Quiz06 {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        System.out.println(array.length); // 배열 안에 3개의 배열이 있는 2차 배열이다.
        System.out.println(array[2].length); // 2번 인덱스의 배열의 길이는 5이다.

    }
}
