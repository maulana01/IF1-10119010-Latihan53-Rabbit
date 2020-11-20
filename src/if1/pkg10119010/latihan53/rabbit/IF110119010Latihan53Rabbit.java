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
public class IF110119010Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is ".concat(rabbit.getName()));
        System.out.println(rabbit.getName().concat(" is Vegetarian? ") + rabbit.isVegetarian());
        System.out.println(rabbit.getName().concat(" eats ").concat(rabbit.getEats()));
        System.out.println(rabbit.getName().concat(" has ") + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName().concat(" has ").concat(rabbit.getColor()));
    }
    
}
