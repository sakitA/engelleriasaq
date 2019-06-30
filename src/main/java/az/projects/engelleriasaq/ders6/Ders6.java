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
public class Ders6 {
    
    public static void main(String[] args) {
        Operator operator = new Bakcell();
        printInfo(operator);
        
        operator.sendSms();
        
        printInfo(operator);
    }
    
    
    public static void printInfo(Operator operator){
        System.out.println("Operator adı: "+operator.getName());
        System.out.println("Operator prefix: "+operator.getPrefix());
        System.out.println("Göndərilən sms sayı: "+operator.getCounter());
        System.out.println("Balans: "+operator.balansiHesabla());
    }
    
}
