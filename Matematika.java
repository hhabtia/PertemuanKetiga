/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketigaa;

/**
 *
 * @author Habtia Humaira
 */
public class Matematika extends MataPelajaran implements Minat, Wajib {
    
    private String topik;
    private String guru;
    
    public Matematika(){
        super.tujuan();
        System.out.println("Tujuan belajar matematika adalah mendorong kemampuan problem solving.");
        this.setTopik("Geometri");
        this.setGuru("PakBudi");
        super.setNamaMapel("MatematikaWajib");
        super.setJumlahJam(3);

    }

    /**
     * @return the topik
     */
    public String getTopik() {
        return topik;
    }

    /**
     * @param topik the topik to set
     */
    public void setTopik(String topik) {
        this.topik = topik;
    }

    /**
     * @return the guru
     */
    public String getGuru() {
        return guru;
    }

    /**
     * @param guru the guru to set
     */
    public void setGuru(String guru) {
        this.guru = guru;
    }

    @Override
    public void statistika() {
        System.out.println("Statistika mencakup analisis dan penyajian data");
    }

    @Override
    public void teoriPeluang() {
        System.out.println("Teori Peluang mempelajari tentang kemungkinan terjadinya suatu peristiwa.");
    }

    @Override
    public void aljabar() {
        System.out.println("Aljabar adalah cabang matematika yang sangat luas dan mendalam.");
    }

    @Override
    public void trigonometri() {
        System.out.println(" Trigonometri adalah cabang ilmu matematika yang mempelajari hubungan antara sisi dan sudut pada segitiga");
    }
    }



