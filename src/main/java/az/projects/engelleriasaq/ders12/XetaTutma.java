/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.ders12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author sanco
 */
public class XetaTutma {

    public static void main(String[] args) throws FileNotFoundException {
        int a = 5;
        int b = 0;
//        mymethod();
        String name = null;
        String name2 = "";//length 0
       // System.out.println(name.toString());
     
      // throw new FileNotFoundException("Bele file yoxdur");
         System.out.println(a/b);
        try{
            System.out.println(a/b);
        }catch(Exception ae){
            System.out.println("0-a bolme mumkun deyil");
        //    System.exit(a);
        }finally{
            System.out.println("Bu kod her zaman isleyecek");
        }
        
//         System.out.println("Process finished");
    }

    public static void mymethod() throws FileNotFoundException {
        mymethod2();
    }

    public static void mymethod2() throws FileNotFoundException {
        File f = new File("");

        FileInputStream fileInputStream = new FileInputStream(f);
    }

}
