package org.benh.Structural.Facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        accountChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public int getAccountNumber(){return accountNumber;}
    public int getSecurityCode(){return securityCode;}

    public void withdrawCash(double cashToWithdraw) {
        if(accountChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())
                && fundChecker.haveEnoughMoney(cashToWithdraw)){
            System.out.println("Transaction complete\n");
        }
        else {
            System.out.println("Transaction failed\n");
        }
    }



    public void depositCash(double cashToDeposit) {
        if(accountChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())){
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete\n");
        }
        else {
            System.out.println("Transaction failed\n");
        }
    }
}
