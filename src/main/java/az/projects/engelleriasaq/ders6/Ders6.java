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
        Operator bakcell = new Bakcell();
       
        bakcell.sendSms();
        
        printInfo(bakcell);

        Operator azercell = new Azercell();
       
        azercell.sendSms();
        
        printInfo(azercell);
        
        
        Operator nar = new nar();
       
        nar.sendSms();
        
        printInfo(nar);
        
        Operator nar1 = new Nar_Mobile();
       
        nar1.sendSms();
        
        printInfo(nar1);
    }
    
    
    public static void printInfo(Operator operator){
        System.out.println("Operator adı: "+operator.getName());
        System.out.println("Operator prefix: "+operator.getPrefix());
        System.out.println("Göndərilən sms sayı: "+operator.getCounter());
        System.out.println("Balans: "+operator.balansiHesabla());
    }
    
}
