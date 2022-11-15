package org.benh.Structural.Facade;

public class FundsCheck {
    private double cashInAccount = 1000;

    public double getCashInAccount(){ return cashInAccount;}

    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }
    public void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw){
        if(cashToWithdraw > getCashInAccount()){
            System.out.println("You dont have enough money");
            System.out.println("Current balance: " + getCashInAccount());

            return false;
        }

        decreaseCashInAccount(cashToWithdraw);
        System.out.println("Withdraw Complete: Current balance is " + getCashInAccount());
        return true;
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete: Current balance is " + getCashInAccount());
    }
}
