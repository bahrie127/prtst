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
import pretest.entity.enuum.KunciMc;

/**
 *
 * ini adalah class SoalMc
 */
@Entity
@Table(name = "soal_mc")
public class SoalMc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "soal_mc_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "pertemuan_praktikum_", nullable = false)
    private PertemuanPraktikum pertemuanPraktikum;
    @Column(name = "soal", nullable = false, length = 255)
    private String soal;
    @Column(name = "a", nullable = false, length = 50)
    private String a;
    @Column(name = "b", nullable = false, length = 50)
    private String b;
    @Column(name = "c", nullable = false, length = 50)
    private String c;
    @Column(name = "d", nullable = false, length = 50)
    private String d;
    @Column(name = "kunci", nullable = false)
    private KunciMc kunciMc;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KunciMc getKunciMc() {
        return kunciMc;
    }

    public void setKunciMc(KunciMc kunciMc) {
        this.kunciMc = kunciMc;
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
        final SoalMc other = (SoalMc) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.pertemuanPraktikum != other.pertemuanPraktikum && (this.pertemuanPraktikum == null || !this.pertemuanPraktikum.equals(other.pertemuanPraktikum))) {
            return false;
        }
        if ((this.soal == null) ? (other.soal != null) : !this.soal.equals(other.soal)) {
            return false;
        }
        if ((this.a == null) ? (other.a != null) : !this.a.equals(other.a)) {
            return false;
        }
        if ((this.b == null) ? (other.b != null) : !this.b.equals(other.b)) {
            return false;
        }
        if ((this.c == null) ? (other.c != null) : !this.c.equals(other.c)) {
            return false;
        }
        if ((this.d == null) ? (other.d != null) : !this.d.equals(other.d)) {
            return false;
        }
        if (this.kunciMc != other.kunciMc) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.pertemuanPraktikum != null ? this.pertemuanPraktikum.hashCode() : 0);
        hash = 89 * hash + (this.soal != null ? this.soal.hashCode() : 0);
        hash = 89 * hash + (this.a != null ? this.a.hashCode() : 0);
        hash = 89 * hash + (this.b != null ? this.b.hashCode() : 0);
        hash = 89 * hash + (this.c != null ? this.c.hashCode() : 0);
        hash = 89 * hash + (this.d != null ? this.d.hashCode() : 0);
        hash = 89 * hash + (this.kunciMc != null ? this.kunciMc.hashCode() : 0);
        return hash;
    }
    
    
}
