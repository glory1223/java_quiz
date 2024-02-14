package ch04;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        //1-1
        int x = (int) (Math.random ()*9) + 11;
        if (10 <x && x <20) {
            System.out.println("1-1은 참입니다.");
        }
        //1-2

        char ch = 'A';
        if (ch != 9 && ch != 32) {
            System.out.println("1-2는 참입니다.");
        }
        //1-3
        char ch1 = 'x';
        if(ch == 120 || ch ==88) {
            System.out.println("1-3은 참입니다.");
        }

        //1-4
        char ch2 =0;
        if(0 <= ch2 && ch2 <=9) {
            System.out.println("1-4는 참입니다.");
        }

        //1-5
        char ch3 = 65;
        if((65 <= ch3 && ch3 <=94) || (97 <=ch3 && ch3 <= 122)) {
            System.out.println("1-5는 참입니다.");
        }

        //1-6
        int year = 2024;
        if((year % 400 == 0 || year %  4 == 0) && year % 100 != 0 ) {
            System.out.println("1-6은 참입니다.");
        }

        //1-7
        boolean powerOn = false;
        if (!powerOn) {
            System.out.println("1-7은 참입니다.");
        }

        //1-8
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("str값: ");
        str = scanner.nextLine();
        if (str.equals("yes")) {
            System.out.println("1-8은 참입니다");
        }
    }
}
