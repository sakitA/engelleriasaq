/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders6;

/**
 *
 * @author sanco
 */
public class Bakcell extends Operator {

    
    public Bakcell() {
        super(Operatorlar.BAKCELL);
        counter = 0;
        balance = 3.0;
    }

    @Override
    public void sendSms() {
        System.out.println("Bakcell sms gonderir...!");
        ++counter;
    }

    @Override
    public String getPrefix() {
        return "055";
    }

    @Override
    public Double balansiHesabla() {
        return balance-counter*0.03;
    }
    
}
