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
public class It extends Heyvan {

    public It() {
        this.age = 1;
        this.name = "toplan";
        this.kind = "it";
        this.tail = true;
        this.weight = 10.5;
        this.height = 120;
    }

    @Override
    public String menimSesim() {
        return "hav-hav";
    }

    
}
