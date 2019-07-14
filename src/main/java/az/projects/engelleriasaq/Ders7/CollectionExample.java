/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.projects.engelleriasaq.Ders7;

import az.projects.engelleriasaq.ders12.InnerClassExample;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author user
 */
public class CollectionExample {
    
    public static void main(String[] args) {
//        Set<String> myarList = new HashSet<>();
//        myarList.add("Cemile");
//        myarList.add("Ulviyye");
//        myarList.add("Gunel");
//        myarList.add("Ali");
//        myarList.add("Gunel");

        //  System.out.println(myarList.toString());
//        System.out.println(myarList.size());
//        myarList.remove("Gunel");
//        System.out.println(myarList.toString());
//        System.out.println(myarList.size());
//     
//      System.out.println(myarList.toString());
//        System.out.println(myarList.contains("fhgfh"));
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Ulviyye");
        map.put(3, "Eli");
        map.put(1, "Gunel");
        map.put(4, "Azad");
        //  System.out.println(map);
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
        
        Object obj = new Employee();

//        Human h=new Teacher();//upcasting
        if (obj instanceof Teacher) {
           Teacher d = (Teacher) obj; 
        }
        //downcasting
    }
}

class Human {
    
    @Override
    public String toString() {
        System.out.println("Human's to String"); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}

class Teacher extends Human {
    
}

class Employee {
    
}
