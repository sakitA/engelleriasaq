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
public class Azercell extends Operator {

    public Azercell(){
        super(Operatorlar.AZERCELL);
    }

    @Override
    public void sendSms() {
        System.out.println("Azercell sms gonderir...!");
        ++counter;
    }

    @Override
    public String getPrefix() {
        return "050/051";
    }

    @Override
    public Double balansiHesabla() {
        return balance - counter*0.05;
    }
    
}
