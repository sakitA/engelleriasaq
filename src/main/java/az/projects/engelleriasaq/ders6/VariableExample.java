/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders6;

/**
 *
 * @author user
 */
public class VariableExample {
    private String name;
    private static int count;
    static final double pi = 3.14;
    
    public VariableExample(){
//        pi = 3.14;
    }
    
    public static void main(String[] args) {
        VariableExample localVariable = new VariableExample();
        localVariable.name = "instance";
        localVariable.count = 4;
        localVariable.print(localVariable);
        
        VariableExample localVariable1 = new VariableExample();
        localVariable1.name = "test";
        --localVariable1.count;
        localVariable1.print(localVariable1);
        
        localVariable.print(localVariable);
    }
    
    private void print(VariableExample ve){
        System.out.println("Name: "+ve.name);
        System.out.println("count: "+ve.count);
    }
    
}
