package org.example;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount: ");
        double initialBalance = sc.nextDouble();
        try {
            // nested try and catch
            try {
                System.out.println("Enter amount to withdraw: ");

                double withDrawAmount = sc.nextDouble();
                validateWithDrawalAmount(withDrawAmount);

                double remainingBalance = updateBalance(initialBalance,withDrawAmount);
                System.out.println(remainingBalance);

            }catch (InvalidWithDrawalException e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }   finally {
            System.out.println("finally blocked executed");
            sc.close();
        }
    }
    private static  void validateWithDrawalAmount(double withDrawalAmount) throws InvalidWithDrawalException{
        if(withDrawalAmount <= 0){
            throw new InvalidWithDrawalException("Withdrawal amount must be greater than zero");
        }
    }
    private static double updateBalance(double initialBalance, double withDrawalAmount) throws  InsuficientFundsException {
        if(withDrawalAmount > initialBalance){
            throw  new InsuficientFundsException("Insufficient funds for withdrawal");
        }
        return initialBalance  - withDrawalAmount;
    }

    static class InsuficientFundsException extends  Exception{
        public InsuficientFundsException(String msg){
            super(msg);
        }
    }

}
