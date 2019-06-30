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
public abstract class Operator implements SmsGonder{
    private Operatorlar operator;
    protected int counter;
    double balance;

    public Operator(){
    }
    
    public Operator(Operatorlar operator) {
        this.operator = operator;
    }

    public String getName() {
        return operator.name();
    }
    
    public abstract String getPrefix();
    
    public abstract Double balansiHesabla();

    public int getCounter() {
        return counter;
    }
    
    
}
