package ch04;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        //1과 100사이의 임의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;  //사용자 입력을 저장할 공간
        int count = 0;  //시도 횟수를 세기위한 변수


        //화면 입력을 받기 위해 Scanner 클래스 사용
        Scanner scanner = new Scanner(System.in);


        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요: ");


            input = scanner.nextInt(); //입력받은 값을 변수에 저장한다.
            if (input < answer) {
                System.out.println("더 큰수를 입력하세요.");
            } else if (input > answer) {
                System.out.println(" 더 작은수를 입력하세요.");
            } else {
                System.out.println(count + "번 시도만에 맞추셨습니다.");
                break;
            }
        }while (true);
    }
}
