/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan53.rabbit;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan Ciri-ciri kelinci dengan konsep OOP
 */
public class Rabbit extends Animal{
    
    private String color, name;
    
    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getName(){
        return this.name;
    }
}
