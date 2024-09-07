/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketigaa;

/**
 *
 * @author Habtia Humaira
 */
public class Utama {

    public static void main(String[] args) {
        Bahasa inggris = new Bahasa();
        System.out.println("Aku adalah " + inggris.getNamaMapel());
        System.out.println("Aku mencakup beberapa materi, yakni :");
        inggris.reading();
        System.out.println("Jumlah jam pelajaranku " + inggris.getJumlahJam());
        System.out.println("Aku berada di tingkat " + inggris.getTingkat() + " dan mengajar materi " + inggris.getMateri());
        inggris.belajar();

        System.out.println("=======================================================");

        //OVERLOADING CODE
        Matematika wajib = new Matematika();
        System.out.println("Aku adalah " + wajib.getNamaMapel());
        System.out.println("Ada banyak yang aku paparkan, yakni :");
        wajib.aljabar();
        wajib.teoriPeluang();
        wajib.statistika();
        wajib.teoriPeluang();
        System.out.println("Jumlah jam pelajaranku adalah " + wajib.getJumlahJam());
        System.out.println("Aku membahas topik tentang " + wajib.getTopik() + " dan guru yang mengajar adalah " + wajib.getGuru());

    }

}
