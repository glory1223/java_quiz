package ch05;

public class Quiz09 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
int totalSum = 0;
int totalStudent = 0;

        for (int i = 0; i < array.length ; i++) {
            totalStudent += array[i].length;
            for (int j = 0; j <array[i].length ; j++) {
           totalSum += array[i][j];
            }
        }
        System.out.println("전체합: " + totalSum);

        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체평균: " + totalAvg);
    }
}

/*
합과 평균구하기
int sum = 0;
int count = 0; // 배열 원소의 갯수

for (int i = 0; i< array.length ; i++) {
     for (int j= 0; j < array[i].length ; j++) {
     sum += array[i][j]
     cotunt++ //배열의 개수만큼 카운트
          }
     }
 */
