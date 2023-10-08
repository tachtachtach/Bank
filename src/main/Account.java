package main;

import java.util.Scanner;

public class Account {
    private long accNumber;
    private String accName;
    private double balanceMoney;
    private final double RATE = 0.035;


    public Account() {
        System.out.println("No param");
    }

    public Account(long accNumber, String accName, double balanceMoney) {
        System.out.println("All param");
        this.accNumber = accNumber;
        this.accName = accName;
        if (balanceMoney < 0) {
            return;
        }
        this.balanceMoney = balanceMoney;

    }

    public Account(long accNumber, String accName) {
        System.out.println("Ten TK va STK");
        this.accNumber = accNumber;
        this.accName = accName;
        this.balanceMoney = 50;
    }

    public long getAccNumber() {
        return this.accNumber;
    }

    public String getAccName() {
        return this.accName;
    }

    public double getBalanceMoney() {
        return this.accNumber;
    }


    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setBalanceMoney(double balanceMoney) {
        while (balanceMoney < 0) {
            System.out.print("should enter the positive: ");
            balanceMoney = new Scanner(System.in).nextDouble();
        }
        this.balanceMoney = balanceMoney;


    }

    @Override
    public String toString() {
        return "The number account of " + this.accName + " is " + this.accNumber + " with money = " + this.balanceMoney;
    }

    //    Nạp tiền
    public void addMoney(double addMoney) {
        this.balanceMoney = this.balanceMoney + addMoney;
        System.out.println("New balance: " + this.balanceMoney);
    }

    //    Rút tiền
    public void withdraw(double withdraw) {
        this.balanceMoney = this.balanceMoney - withdraw;
        System.out.println("New balance: " + this.balanceMoney);
    }

    //    Đáo hạn
    public void expire() {
        this.balanceMoney = this.balanceMoney + this.balanceMoney * this.RATE;
        System.out.println("New balance: " + this.balanceMoney);
    }

}
