/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders12;

/**
 *
 * @author user
 */
public class InnerClassExample {
    
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        
        OuterClass.InnerClass1 ic1 = oc.new InnerClass1();
        
        System.out.println(ic1.a);
    }
}
