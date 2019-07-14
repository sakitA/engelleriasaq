/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.Ders7;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class Card {

    String cardHolder;
    String cardName;
    String expireDate;
    LocalDateTime dateTime;
    double balance;

    public void addAmount(double amount) {
        if (amount<=0) {
           throw  new IllegalArgumentException("Bele deyer elave oluna bilmez");
        }
        balance += amount;
    }
    public void minusAmount(double amount) {
        if (amount>balance) {
           throw new IllegalArgumentException("Kifayet qeder balanziniz yoxdur");
        }
        balance -= amount;
    }
    
    public void printCardInfo(){
        System.out.println("CardHolder "+cardHolder);
        System.out.println("CardName "+cardName);
        System.out.println("CardExpireDate "+expireDate);
        System.out.println("Card Balance  "+balance);
        System.out.println("Tranzaction Date  "+dateTime);
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
