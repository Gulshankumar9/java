import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int a;
    double b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextDouble();
    c=sc.nextDouble();
    Account account=new Account(a, b, c);
    int noOfYear;
    noOfYear=sc.nextInt();
    double answer = calculateInterest(account, noOfYear);
    System.out.format("%.3f",answer);
    
    
    }
    
    public static double calculateInterest(Account account, int noOfyear)
    {
        double temp=noOfyear * account.getInterestRate()/100;
        return (account.getBalance()*(account.getInterestRate()+temp)/100);
    }
}

class Account
{
    private int id;
    private double balance;
    private double interestRate;
    Account(int id,double balance,double interestRate){
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public int getid(){
        return this.id;
        
    }
    public void setid(int id){
        this.id=id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    
}