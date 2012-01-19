/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.server.util;

/**
 *
 * ini adalah class StatistikJawaban
 */
public class StatistikJawaban {

    private String parktikum;
    private String ke;
    private Long idSoal;
    private int persenBenar;
    private int persenSalah;
    private int jumlahMhs;

    public Long getIdSoal() {
        return idSoal;
    }

    public void setIdSoal(Long idSoal) {
        this.idSoal = idSoal;
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }

    public void setJumlahMhs(int jumlahMhs) {
        this.jumlahMhs = jumlahMhs;
    }

    public String getKe() {
        return ke;
    }

    public void setKe(String ke) {
        this.ke = ke;
    }

    public String getParktikum() {
        return parktikum;
    }

    public void setParktikum(String parktikum) {
        this.parktikum = parktikum;
    }

    public int getPersenBenar() {
        return persenBenar;
    }

    public void setPersenBenar(int persenBenar) {
        this.persenBenar = persenBenar;
    }

    public int getPersenSalah() {
        return persenSalah;
    }

    public void setPersenSalah(int persenSalah) {
        this.persenSalah = persenSalah;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StatistikJawaban other = (StatistikJawaban) obj;
        if ((this.parktikum == null) ? (other.parktikum != null) : !this.parktikum.equals(other.parktikum)) {
            return false;
        }
        if ((this.ke == null) ? (other.ke != null) : !this.ke.equals(other.ke)) {
            return false;
        }
        if (this.idSoal != other.idSoal && (this.idSoal == null || !this.idSoal.equals(other.idSoal))) {
            return false;
        }
        if (this.persenBenar != other.persenBenar) {
            return false;
        }
        if (this.persenSalah != other.persenSalah) {
            return false;
        }
        if (this.jumlahMhs != other.jumlahMhs) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.parktikum != null ? this.parktikum.hashCode() : 0);
        hash = 73 * hash + (this.ke != null ? this.ke.hashCode() : 0);
        hash = 73 * hash + (this.idSoal != null ? this.idSoal.hashCode() : 0);
        hash = 73 * hash + this.persenBenar;
        hash = 73 * hash + this.persenSalah;
        hash = 73 * hash + this.jumlahMhs;
        return hash;
    }
}
