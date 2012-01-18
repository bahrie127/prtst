/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pretest.entity.enuum.KunciBs;

/**
 *
 * ini adalah class SoalBs
 */
@Entity
@Table(name = "soal_bs")
public class SoalBs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "soal_bs_id")
    private Long id;
    @Column(name = "soal", nullable = false, length = 255)
    private String soal;
    @Column(name = "kunci", nullable = false)
    private KunciBs kunci;
    @ManyToOne
    @JoinColumn(name = "pertemuan_praktikum_", nullable = false)
    private PertemuanPraktikum pertemuanPraktikum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KunciBs getKunci() {
        return kunci;
    }

    public void setKunci(KunciBs kunci) {
        this.kunci = kunci;
    }

    public PertemuanPraktikum getPertemuanPraktikum() {
        return pertemuanPraktikum;
    }

    public void setPertemuanPraktikum(PertemuanPraktikum pertemuanPraktikum) {
        this.pertemuanPraktikum = pertemuanPraktikum;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoalBs other = (SoalBs) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.soal == null) ? (other.soal != null) : !this.soal.equals(other.soal)) {
            return false;
        }
        if (this.kunci != other.kunci) {
            return false;
        }
        if (this.pertemuanPraktikum != other.pertemuanPraktikum && (this.pertemuanPraktikum == null || !this.pertemuanPraktikum.equals(other.pertemuanPraktikum))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 41 * hash + (this.soal != null ? this.soal.hashCode() : 0);
        hash = 41 * hash + (this.kunci != null ? this.kunci.hashCode() : 0);
        hash = 41 * hash + (this.pertemuanPraktikum != null ? this.pertemuanPraktikum.hashCode() : 0);
        return hash;
    }
    
    
}
