/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author 1
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create 3 bank accounts
        BankAccountMethods acaunt1 = new BankAccountMethods();
        BankAccountMethods acaunt2 = new BankAccountMethods();
        BankAccountMethods acaunt3 = new BankAccountMethods(50000.3,20000000.6);
        
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        acaunt1.addCheckingBalance(10000);
        acaunt1.addSavingsBalance(10000);
        acaunt2.addCheckingBalance(20000);
        acaunt2.addSavingsBalance(20000);
        acaunt3.addCheckingBalance(100000);
        acaunt3.addSavingsBalance(200000);
        

        


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        acaunt1.takeCheckingBalance(10000);
        acaunt1.takeSavingsBalance(10000);
        acaunt2.takeCheckingBalance(20000);
        acaunt2.takeSavingsBalance(20000);
        acaunt3.takeCheckingBalance(100000);
        acaunt3.takeSavingsBalance(200000);        
        // - each withdrawal should decrease the amount of totalMoney
        
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("number of bank acaunts equal :" + BankAccountMethods.getAccounts());
        System.out.println("total amount in bank  equal :" + BankAccountMethods.getTotalMoney());
        System.out.println("total amount in acaunt1  equal :" + acaunt1.getBalance());
        System.out.println("total amount in acaunt2  equal :" + acaunt2.getBalance());
        System.out.println("total amount in acaunt3  equal :" + acaunt3.getBalance());
    }
    
}
