package main;

public class Account {
    private long accNumber;
    private String accName;
    private double balanceMoney;

    public Account() {
        System.out.println("No param");
    }

    public Account(long accNumber, String accName, double balanceMoney) {
        System.out.println("All param");
        this.accNumber = accNumber;
        this.accName = accName;
        this.balanceMoney = balanceMoney;
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
        this.balanceMoney = balanceMoney;
    }

    @Override
    public String toString() {
        return "Stk cua " + this.accName + "la: " + this.accNumber + "con: " + this.balanceMoney;
    }

}
