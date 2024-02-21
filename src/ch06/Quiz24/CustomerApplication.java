package ch06.Quiz24;

import java.util.Scanner;

public class CustomerApplication {
   private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        boolean run = true;

        while(run) {
            System.out.println("----------------------------------");
            System.out.println("고객등록 | 고객리스트 | 포인트사용 | 포인트적립");
            System.out.println("----------------------------------");

            System.out.println("선택");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1 : Customer.register();
                        break;
                case 2 : Customer.customerList();
                    break;
                case 3 : Customer.usePoint();
                    break;
                case 4 : Customer.plusPoint();
                    break;
            }


        }

    }
}
