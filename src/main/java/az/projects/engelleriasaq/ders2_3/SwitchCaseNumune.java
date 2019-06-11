/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders2_3;

import java.util.Scanner;

/**
 *
 * @author sanco
 */
public class SwitchCaseNumune {

    public static void main(String[] args) {
        /* Scanner sinfi(classı) istifadəçinin məlumat daxil etməsi 
         * üçün istifadə olunur. Növbəti dərslərdə detallı izah olunacaq
         */
        Scanner input = new Scanner(System.in);

        int girilenEded = input.nextInt();

        switch (girilenEded) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Həftədə 7 gün var :)");

        }
    }

}
