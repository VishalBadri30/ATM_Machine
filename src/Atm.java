import java.util.Scanner;
import java.text.DecimalFormat;

public class Atm {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return  savingBalance;
    }

    public void calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
    }

    public void calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
    }

    public void calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
    }

    public void calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        if(checkingBalance == 0){
            System.out.println("Balance is '0' cannot withdraw");
            return;
        }
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("Withdraw Successful");
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Insufficient Balance, Balance cannot be negative.\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        if(savingBalance == 0){
            System.out.println("Balance is '0' cannot withdraw");
            return;
        }
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("Withdraw Successful");
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Insufficient Balance, Balance cannot be negative.\n");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("Deposit Successful");
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative.\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposit from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("Deposit Successful");
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative.\n");
        }
    }



}
