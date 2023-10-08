package test;

import main.Account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
//        Account Trang = new Account(217, "Trang", 444);
//        System.out.println(Trang.toString());

        Account Viet = new Account();
        System.out.print("Nhập STK: ");
        Viet.setAccNumber(new Scanner(System.in).nextLong());
        System.out.print("Nhập tên: ");
        Viet.setAccName(new Scanner(System.in).nextLine());
        System.out.print("Nhập số tiền: ");
        Viet.setBalanceMoney(new Scanner(System.in).nextDouble());
        System.out.println(Viet.toString());
        Viet.addMoney(1);

//        Trang.withdraw(10);
//        Trang.expire();
//        System.out.println(Trang.toString());

    }
}
