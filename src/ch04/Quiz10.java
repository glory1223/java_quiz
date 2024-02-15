package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
      int balance = 0;

        while (true){
          System.out.println("---------------------");
          System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
          System.out.println("---------------------");

          Scanner scanner = new Scanner(System.in);
          System.out.print("선택  >  ");
          String s1 = scanner.nextLine();

          if (s1.equals("1")){
              System.out.print("예금액  >  ");
              int in = Integer.parseInt(scanner.nextLine());
              balance += in;
          } else if (s1.equals("2")) {
              System.out.print("출금액  >  ");
               int out = Integer.parseInt(scanner.nextLine());
               balance -= out;
          } else if (s1.equals("3")) {
              System.out.println("잔고  >  " + balance);
          } else {
              System.out.println("프로그램 종료");
              break;
          }
        }
    }
}


/*
while (bank) {
    System.out.println("----------------");
    System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
    System.out.println("----------------");

    String selectNum = scanner.nextLine();

    switch (selectNum) {
        case "1":
            System.out.print("예금할 금액: ");
            balance += scanner.nextInt();
            break;
        case "2":
            System.out.print("출금할 금액: ");
            balance -= scanner.nextInt();
            break;
        case "3":
            System.out.print("잔고: ");
            System.out.print(balance);
            break;
        case "4":
            bank = false;
            break;
    }
}
System.out.println("프로그램 종료");
 */