/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders12;

/**
 *
 * @author sanco
 */
public class XetaTutma {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        System.out.println(a/b);
        
        
        try{
            System.out.println(a/b);
        }catch(ArithmeticException ae){
            System.out.println("0-a bolme mumkun deyil");
        }finally{
            System.out.println("Bu kod her zaman isleyecek");
        }
    }
    
}
