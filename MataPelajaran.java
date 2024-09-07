/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketigaa;

/**
 *
 * @author Habtia Humaira
 */
public class MataPelajaran extends Kurikulum {
    private String namaMapel;
    private int jumlahJam;

    @Override
    void menuntutIlmu() {
        System.out.println("Menuntut ilmu itu penting");
    }

    @Override
    void belajar() {
        System.out.println("Belajarlah yang rajin");
    }

    /**
     * @return the namaMapel
     */
    public String getNamaMapel() {
        return namaMapel;
    }

    /**
     * @param namaMapel the namaMapel to set
     */
    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    /**
     * @return the jumlahJam
     */
    public int getJumlahJam() {
        return jumlahJam;
    }

    /**
     * @param jumlahJam the jumlahJam to set
     */
    public void setJumlahJam(int jumlahJam) {
        this.jumlahJam = jumlahJam;
    }
    
}
