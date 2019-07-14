/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders6;

/**
 *
 * @author User-V
 */

public class nar extends Operator{ 
   
    public nar() {
        super(Operatorlar.NAR);
        counter = 0;
        balance = 6.0;
    }

    @Override
    public void sendSms() {
        System.out.println("nar sms gonderir...!");
        ++counter;
    }

    @Override
    public String getPrefix() {
        return "070/077";
    }

    @Override
    public Double balansiHesabla() {
        return balance-counter*0.03;
    }
    
}
