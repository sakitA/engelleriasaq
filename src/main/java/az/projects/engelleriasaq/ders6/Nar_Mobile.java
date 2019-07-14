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
public class Nar_Mobile extends Operator { 
    public Nar_Mobile () { 
        super(Operatorlar.NAR);
        counter = 0;
        balance = 5.00;
        
              
    
    }
      @Override
    public void sendSms() {
        System.out.println("Nar Mobile sms gonderir...!");
        ++counter;
    }

    @Override
    public String getPrefix() {
        return "077/070";
    }

    @Override
    public Double balansiHesabla() {
        return balance-counter*0.05;
    }
    
}
