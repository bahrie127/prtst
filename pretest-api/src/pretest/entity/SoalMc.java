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
}
