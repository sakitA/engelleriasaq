/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.Ders7;

/**
 *
 * @author user
 */
public class AnonymousClass{

    public static void main(String[] args) {
      Example e=new Example();
      e.printName();
    }

}

interface MyInterface {

    void printName();
}
class Example implements MyInterface{

    @Override
    public void printName() {
        System.out.println("Gunay");    }
    
}