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

/**
 *
 * ini adalah class NilaiBs
 */
@Entity
@Table(name = "nilai_bs")
public class NilaiBs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nilai_bs_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mahasiswa_", nullable = false)
    private Mahasiswa mahasiswa;
    @ManyToOne
    @JoinColumn(name = "pertemuan_praktikum_", nullable = false)
    private PertemuanPraktikum pertemuanPraktikum;
    @Column(name = "nilai", nullable = false)
    private Double nilai;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }

    public PertemuanPraktikum getPertemuanPraktikum() {
        return pertemuanPraktikum;
    }

    public void setPertemuanPraktikum(PertemuanPraktikum pertemuanPraktikum) {
        this.pertemuanPraktikum = pertemuanPraktikum;
    }
}
