/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.Ders7;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class Run {
    public static void main(String[] args) {
        Card card=new Card();
        card.setCardHolder("Cemile Memmedli");
        card.setCardName("Debet Card");
        card.setExpireDate("12/19");
        card.setBalance(500);
        card.setDateTime(LocalDateTime.now());
        card.minusAmount(700);
        card.printCardInfo();
        
    }
}
