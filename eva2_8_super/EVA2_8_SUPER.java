/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_8_super;

/**
 *
 * @author eduar
 */
public class EVA2_8_SUPER {

    public static void main(String[] args) {
        Animal animal = new Animal ("LALO", 10);
        Mamifero mami = new Mamifero ("BLANCO", "LALITO", 47839);
        Canes can = new Canes ();
        
        
    }
}
class Animal{
    private String nombre;
    private int peso;
    
     public Animal() {
        System.out.println("ITS ALIVE");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE CONSTRUCTOR 2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void respirar (){
        System.out.println("Estoy respirando");
}
    
}
class Mamifero extends Animal {
    private String coloPelo;

    public Mamifero() {
        //super --> apuntador a la superclase
        //lo primero a llamar en un constructor es llamar
        //al constructor de la superclase
        super();//llamada al constructor default
        System.out.println("mamifero!");
    }

    public Mamifero(String coloPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constrcutor de la superclase
        this.coloPelo = coloPelo;
        System.out.println("soy un mamifero! constructor dos");
    }
    
    

    public String getColoPelo() {
        return coloPelo;
    }

    public void setColoPelo(String coloPelo) {
        this.coloPelo = coloPelo;
    }
    
}
class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can!");
    }
    
}