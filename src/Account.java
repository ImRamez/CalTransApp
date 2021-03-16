/**
 * @author Jesus Naranjo
 * @version 14 March 2020
 * */
import java.util.*;
public class Account{
    public final double MINIMUM=500.00;

    private
    String firstName;
    String lastName;
    int accountNumber;
    double balance;

    public Account(){

    }

    /**
     *     // regular constructor
     * @param firstName
     * @param lastName
     * @param accountNumber
     * @param balance
     */
    public Account(String firstName, String lastName, int accountNumber,double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * @return string form name account with balance
     */
    public String toString(){
        String output = String.format("%10s%10s%12s%d%10s%10.2f", firstName,lastName, ": Account Number ",accountNumber," Balance: ",balance);

        return output;
    }

    /**
     *     //deposit amount
     *     // if amount is negative throw InputMismatch Exception
     * @param amount
     */
    public void deposit(double amount){
        try {
            if (amount < 0) {
                System.out.print("Cannot deposit negative amount ");
                throw new InputMismatchException();
            }else
                addAmount(amount);

        }catch (InputMismatchException e){
            System.out.println(e.getClass());
        }
    }

    /**
     *     //if amount withdrawn leaves less than minimum throw InputMismatch exception
     * @param amount
     */
    public void withdraw(double amount){
        subAmount(amount);
        try {
            if (balance < MINIMUM) {
                throw new InputMismatchException();
            }else
                System.out.println(getFirstName() + "\t\t"+getLastName() + ": "+"Account Number "+getAccountNumber()+" Balance: "+getBalance());
        }catch (InputMismatchException e){
            System.out.print("Cannot Withdraw: Balance under Minimum ");
            System.out.println(new InputMismatchException());
        }
    }

    /**
     *     //subtracts amount from balance
     * @param balance
     */
    public void subAmount(double balance){
        this.balance -= balance;

//        return balance;
    }

    /**
     *     //adds balance to the log
     * @param balance
     */
    public void addAmount(double balance){
        this.balance += balance;
        System.out.println(getFirstName() + "\t\t"+getLastName() + ": "+"Account Number "+getAccountNumber()+" Balance: "+getBalance());
    }

    /**
     * @param balance
     */
    public void setBalance(double balance){
        this.balance = balance;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * @return accountNumber
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     * @return balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     *         // implement this method to compare two bank account numbers, from this and other
     * @param other
     * @return int
     */
    public int compareTo(Account other){
        if(accountNumber < other.accountNumber) { //other is greater than accountNumber
            return -1;          //would be considered a neg
        }else if(accountNumber == other.accountNumber){
            return 0;
        }else{  //accountNumber > other
            return 1;
        }
    }

    /**
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }

}