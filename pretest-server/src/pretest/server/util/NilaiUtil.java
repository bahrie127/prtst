/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.server.util;

/**
 *
 * ini adalah class NilaiUtil
 */
public class NilaiUtil {

    private Long idPertemuanPraktikum;
    private String namaPraktikum;
    private String praktikumKe;
    private int lulus;
    private int gagal;
    private double nilaiMax;
    private double nilaiMin;
    private double rata;

    public Long getIdPertemuanPraktikum() {
        return idPertemuanPraktikum;
    }

    public void setIdPertemuanPraktikum(Long idPertemuanPraktikum) {
        this.idPertemuanPraktikum = idPertemuanPraktikum;
    }

    public String getNamaPraktikum() {
        return namaPraktikum;
    }

    public void setNamaPraktikum(String namaPraktikum) {
        this.namaPraktikum = namaPraktikum;
    }

    public String getPraktikumKe() {
        return praktikumKe;
    }

    public void setPraktikumKe(String praktikumKe) {
        this.praktikumKe = praktikumKe;
    }

    public int getGagal() {
        return gagal;
    }

    public void setGagal(int gagal) {
        this.gagal = gagal;
    }

    public int getLulus() {
        return lulus;
    }

    public void setLulus(int lulus) {
        this.lulus = lulus;
    }

    public double getNilaiMax() {
        return nilaiMax;
    }

    public void setNilaiMax(double nilaiMax) {
        this.nilaiMax = nilaiMax;
    }

    public double getNilaiMin() {
        return nilaiMin;
    }

    public void setNilaiMin(double nilaiMin) {
        this.nilaiMin = nilaiMin;
    }

    public double getRata() {
        return rata;
    }

    public void setRata(double rata) {
        this.rata = rata;
    }
}
