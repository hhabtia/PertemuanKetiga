/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketigaa;

/**
 *
 * @author Habtia Humaira
 */
public class Bahasa extends MataPelajaran implements BahasaInggris, BahasaJepang {

    private String tingkat;
    private String Materi;

    /**
     * @return the tingkat
     */
    public Bahasa() {
        super.tujuan();
        System.out.println("Tujuan belajar bahasa adalah keterampilan komunikasi dalam berbagai konteks komunikasi.");
        this.setTingkat("Dasar");
        this.setMateri("NamaHewan");
        super.setNamaMapel("BahasaInggris");
        super.setJumlahJam(2);

    }

    public String getTingkat() {
        return tingkat;
    }

    /**
     * @param tingkat the tingkat to set
     */
    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    /**
     * @return the Materi
     */
    public String getMateri() {
        return Materi;
    }

    /**
     * @param Materi the Materi to set
     */
    public void setMateri(String Materi) {
        this.Materi = Materi;
    }

    @Override
    public void grammar() {
        System.out.println("Grammar bertujuan untuk enghindari kesalahan");
    }

    @Override
    public void speaking() {
        System.out.println("Speaking meningkatkan kemampuan berbicara");
    }

    @Override
    public void writing() {
        System.out.println("Writing membuat kita bisa mengekspresikan ide-ide secara jelas");
    }

    @Override
    public void reading() {
        System.out.println("Reading bertujuan untuk meningkatkan kosakata");
    }
}
