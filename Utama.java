/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Habtia Humaira
 */
public class Utama {
     public static void main(String[] args) {
        Matematika diskrit = new Matematika(); 
        diskrit.start(); 
        diskrit.stop();  
        diskrit.siswa();
        diskrit.siswa("eksklusif");
        System.out.println(diskrit.siswa(2));
        System.out.println("");
    }
}
