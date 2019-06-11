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
public class IfElseVeWhileNumune {

    public static void main(String[] args) {
        /* Scanner sinfi(classı) istifadəçinin məlumat daxil etməsi 
         * üçün istifadə olunur. Növbəti dərslərdə detallı izah olunacaq
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Ədəd daxil edin(çıxmaq üçün 0 daxil edin):");
        int girilenEded = 0;
        do{
            girilenEded = input.nextInt();
            System.out.print("Daxil etdiyiniz ədəd "+girilenEded+".");
            
            if(girilenEded == 0){
                System.out.println("Təşəkkür edirik!");
                break;
            }else if(girilenEded % 3 == 0){
                System.out.println("Bu ədəd 3ə tam bölünür");
            }else{
                System.out.println("Bu ədəd 3ə tam bölünmür. Qalıq: "+(girilenEded%3));
            }
        }while(true);
    }
}
