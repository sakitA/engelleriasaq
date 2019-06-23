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
public class Ders5 {
    public static void main(String[] args) {
//        Heyvan heyvan = new Heyvan(3, "Mestan");
//        heyvan.setColor("ag");
//        heyvan.setHeight(30);
//        heyvan.setKind("pisik");
//        heyvan.setWeight(10);
//        heyvan.setTail(true);
//        melumatlariCapEt(heyvan);
//        
//        
//        Heyvan heyvan1 = new Heyvan(5,"Toplan", true);
//        heyvan1.setColor("boz");
//        heyvan1.setHeight(45);
//        heyvan1.setKind("it");
//        heyvan1.setWeight(100);
//        heyvan1.setTail(false);
//        melumatlariCapEt(heyvan1);

        Heyvan heyvan = new Heyvan();
        sesiniCixart(heyvan);
        
        System.out.println("----------------");
        
        Heyvan it = new It();
        sesiniCixart(it);
        
        System.out.println("----------------");
        
        Heyvan pisik = new Pisik();
        sesiniCixart(pisik);
    }
    
    public static void melumatlariCapEt(Heyvan heyvan){
        System.out.println("Mənim adım: "+heyvan.getName());
        System.out.println("Mənim yaşım: "+heyvan.getAge());
        System.out.println("Mənim rəngim: "+heyvan.getColor());
        System.out.println("Mənim növüm: "+heyvan.getKind());
        System.out.println("Mənim çəkim: "+heyvan.getWeight());
        System.out.println("Mənim boyum: "+heyvan.getHeight());
        System.out.println("Mənim quyruğum : "+(heyvan.hasTail()? "var":"yoxdur"));
    }
    
    public static void sesiniCixart(Heyvan heyvan){
        System.out.println("Menim tipim: "+heyvan.getKind());
        System.out.println("Menim sesim: "+heyvan.menimSesim());
    }
}
