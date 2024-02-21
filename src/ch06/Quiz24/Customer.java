package ch06.Quiz24;

import java.util.Scanner;

public class Customer {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];
    private  String name;
    private  String number;
    private  String address;
    private  int point;

    private  Customer (String name, String number, String address, int point) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    //고객 등록 메소드
    static void register() {
        System.out.println("--------------------");
        System.out.println("고객 등록");
        System.out.println("--------------------");

        System.out.print("고객성함: ");
        String name = scanner.next();

        System.out.println("휴대폰번호: ");
        String number = scanner.next();

        System.out.println("집주소: ");
        String address = scanner.next();

        System.out.println("포인트 등록");
        int point = scanner.nextInt();

        Customer regCustomer = new Customer(name, number, address, point);

        for(int i = 0; i <customerArray.length; i ++) {
            if(customerArray[i] == null) {
                customerArray[i] = regCustomer;
                System.out.println("고객 등록이 완료되었습니다.");
                break;
            }
        }
    }

    //고객리스트 메소드
    static void customerList() {
        System.out.println("--------------------");
        System.out.println("블랙리스트");
        System.out.println("--------------------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];

            if(customer != null) {
                System.out.print(customer.getName());
                System.out.print("\t\t\t" + customer.getNumber());
                System.out.println("\t\t\t" + customer.getPoint());
            } else break;
        }

    }

    //포인트사용 메소드
    static void usePoint() {
        System.out.println("--------------------");
        System.out.println("포인트 사용");
        System.out.println("--------------------");

        System.out.print("휴대폰번호: ");
        String number = scanner.next();

        System.out.print("사용할 포인트: ");
        int howManyPoint = scanner.nextInt();

        //휴대폰번호찾기 만들자
        Customer customer = searchNumber(number); //휴대폰번호 객체

        if(customer == null) {
            System.out.println("존재하지 않는 고객정보입니다.");
            return;
        } else if (howManyPoint < 500) System.out.println("포인트 500점부터 사용할수있어요!");
        else if (howManyPoint > customer.getPoint()) {
            System.out.println("사용할 포인트보다 잔액이 적어요.");
            return;
        }
        else {
            customer.setPoint(customer.getPoint() - howManyPoint);
            System.out.println("포인트가 사용되었습니다.");
        }
    }

    //포인트 적립 메소드
    static void plusPoint () {
        System.out.println("--------------------");
        System.out.println("포인트 적립");
        System.out.println("--------------------");

        System.out.print("휴대폰번호: ");
        String number = scanner.next();

        System.out.print("적립할 포인트: ");
        int howManyPoint = scanner.nextInt();

        Customer customer = searchNumber(number); //휴대폰번호 객체

        if(customer == null) {
            System.out.println("존재하지 않는 고객정보입니다.");
            return;
        } else if (howManyPoint >=  2000){
            customer.setPoint((int) (customer.getPoint() + (howManyPoint*(double)1.2)));
            System.out.println("포인트 적립이 완료되었어요! 포인트잔액은 " + customer.getPoint() + "입니다."  );
        } else {
            customer.setPoint(customer.getPoint() + howManyPoint);
            System.out.println("포인트 적립이 완료되었어요! 포인트잔액은 " + customer.getPoint() + "입니다."  );
        }
    }



    //휴대폰번호 객체 반환 메소드
    static Customer searchNumber (String number) {
        Customer customer = null;

        for (int i = 0; i <customerArray.length; i++) {
            if(customerArray[i] != null) {
                String customerPhone = customerArray[i].getNumber();
                if (customerPhone.equals(number)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer; //객체 반환
    }
}

