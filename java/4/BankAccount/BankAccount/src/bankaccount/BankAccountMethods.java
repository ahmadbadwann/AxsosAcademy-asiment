/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author 1
 */
public final class BankAccountMethods {

    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccountMethods(double checkBalnace, double saveBalance) {
        setCheckingBalance(checkBalnace);
        setSavingsBalance(saveBalance);
        setAccounts(getAccounts() + 1);
        setTotalMoney(getTotalMoney() + getSavingsBalance() + getCheckingBalance());
    }

    public BankAccountMethods() {
        setCheckingBalance(0.0);
        setSavingsBalance(0.0);
        setAccounts(getAccounts() + 1);
        setTotalMoney(getTotalMoney() + getSavingsBalance() + getCheckingBalance());
    }

    public void setCheckingBalance(double val) {
        checkingBalance = val;
    }

    public void setSavingsBalance(double val) {
        savingsBalance = val;
    }

    public void setAccounts(int val) {
        accounts = val;
    }

    public void setTotalMoney(double val) {
        totalMoney = val;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    public void addCheckingBalance(double val) {
        setCheckingBalance(getCheckingBalance() + val);
        setTotalMoney(getTotalMoney() + val);
    }

    public void addSavingsBalance(double val) {
        setSavingsBalance(getSavingsBalance() + val);
        setTotalMoney(getTotalMoney() + val);
    }

    public String takeCheckingBalance(double val) {
        if (val > getCheckingBalance()) {
            return "the ammount in your checkingBalance ia not enugh";
        }
        checkingBalance -= val;
        setTotalMoney(getTotalMoney() - val);
        return "you drow " + val + " from your checkingBalance, your checkingBalance value now is " + getCheckingBalance();
    }

    public String takeSavingsBalance(double val) {
        if (val > getSavingsBalance()) {
            return "the ammount in your getSavingsBalance ia not enugh";
        }
        checkingBalance -= val;
        setTotalMoney(getTotalMoney() - val);
        return "you drow " + val + " from your SavingsBalance, your SavingsBalance value now is " + getSavingsBalance();
    }

    public double getBalance() {
        return getCheckingBalance() + getSavingsBalance();
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
