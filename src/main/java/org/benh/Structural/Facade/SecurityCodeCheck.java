package org.benh.Structural.Facade;

public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode(){
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCodeToCheck){
        if(securityCodeToCheck == getSecurityCode()){
            return true;
        }
        return false;
    }
}
