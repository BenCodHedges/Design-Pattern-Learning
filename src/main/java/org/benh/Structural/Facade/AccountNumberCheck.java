package org.benh.Structural.Facade;

public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean accountActive(int accountNumberToCheck){
        if(accountNumberToCheck == getAccountNumber()){
            return true;
        }
        return false;
    }
}
