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
public class Heyvan {
    int age;
    String color;
    String name;
    String kind;
    boolean tail;
    double weight;
    double height;

    public Heyvan() {
        this.age = 1;
        this.name = "heyvan";
        this.tail = true;
        this.weight = 0.5;
        this.height = 10;
    }

    public Heyvan(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    public Heyvan(int age, String name, boolean tail) {
        this();
        this.age = age;
        this.name = name;
        this.tail = tail;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean hasTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public String menimSesim(){
        return "teyin olunmayib";
    }
}
