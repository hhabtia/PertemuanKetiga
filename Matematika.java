/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Habtia Humaira
 */
public class Matematika extends MataPelajaran implements Mulai, Selesai {

    String guru;
    int jumlahJam;

    public Matematika() {
        System.out.println("Aku adalah matematika");
        super.tujuan();
        MataPelajaran();
    }

    public void siswa() {
        System.out.println("Siswa tidak terlalu suka matematika");
    }

    public void siswa(String eksklusif) {
        System.out.println("Ada beberapa siswa yang sangat suka dengan matematika");
    }

    public String siswa(int jumlahJam) {
        return "Jumlah jam mata pelajaran ini adalah " + jumlahJam + " jam";
    }

    @Override
    void MataPelajaran() {
        System.out.println("Ini adalah mata pelajaran");
    }

    @Override
    public void start() {
        System.out.println("Kelas baru saja dimulai");
    }

    @Override
    public void stop() {
        System.out.println("Kelas sudah selesai");
    }
}
