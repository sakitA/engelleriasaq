/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EngelleriAsaq {
    
    public static void main(String[] args) {
        EngelleriAsaq engelleriAsaq = new EngelleriAsaq();
        
        engelleriAsaq.printMyWord("Engelleri Asaq");
        
        Scanner input = new Scanner(System.in);
        
        engelleriAsaq.printMyWord("Bir rəqəm daxil edin:");
        int day = input.nextInt();
        
        HefteninGunleri gun = HefteninGunleri.values()[day-1];
        switch(gun){
            case BAZAR_ERTESI:
                engelleriAsaq.printMyWord("Bazar Ertəsi");
                break;
            case CERSENBE_AXSAMI:
                engelleriAsaq.printMyWord("Çərşənbə Axşamı");
                break;
            case CERSENBE:
                engelleriAsaq.printMyWord("Çərşənbə");
                break;
            case CUME_AXSAMI:
                engelleriAsaq.printMyWord("Cümə Axşamı");
                break;
            case CUME:
                engelleriAsaq.printMyWord("Cümə");
                break;
            case SENBE:
                engelleriAsaq.printMyWord("Şənbə");
                break;
            case BAZAR:
                engelleriAsaq.printMyWord("Bazar");
                break;
            default:
                engelleriAsaq.printMyWord("Belə bir gün mövcud deyil");
        }
    }
    
    public void printMyWord(String word){
        System.out.println(word);
    }
}