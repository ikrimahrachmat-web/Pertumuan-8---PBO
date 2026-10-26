/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum8;

/**
 *
 * @author admin
 */
public class PoliTester {
    public static void main(String[] args) {
        //deklarasi array dari tipe superclass. tetapi diisi dengan objek subclass
        Hewan [] daftarHewan = new Hewan [3];
        daftarHewan [0] = new Hewan ();
        daftarHewan [1] = new kucing (); //upcasting
        daftarHewan [2] = new Anjing (); //upcasting
    
        //polimorfisme : pemanggilam method yang sama menghasilkan output berbeda
        for (Hewan h: daftarHewan) {
            h.bersuara();
        }
    }
}
