/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders2_3;

/**
 *
 * @author sanco
 */
public class MassivVeDovrNumune {
    
    public static void main(String[] args) {
        int[] a = new int[10];
        
        for(int i=0;i<a.length; i++){
            a[i] = i%5;
        }
        
        int ind = 0;
        
        while(ind<a.length){
            System.out.println(a[ind]);
            ++ind;
        }
    }
    
}
