/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders5;

/**
 *
 * @author user
 */
public class Pisik extends Heyvan {

    public Pisik() {
        this.age = 1;
        this.name = "mestan";
        this.tail = true;
        this.kind = "pisik";
        this.color = "sari";
        this.weight = 16.2;
        this.height = 100;
    }

    @Override
    public String menimSesim() {
        return "miyau";
    }

    
}
