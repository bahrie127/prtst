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
import pretest.entity.enuum.StatusNilai;

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
    @Column(name="status",nullable=true)
    private StatusNilai statusNilai;

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

    public StatusNilai getStatusNilai() {
        return statusNilai;
    }

    public void setStatusNilai(StatusNilai statusNilai) {
        this.statusNilai = statusNilai;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NilaiBs other = (NilaiBs) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.mahasiswa != other.mahasiswa && (this.mahasiswa == null || !this.mahasiswa.equals(other.mahasiswa))) {
            return false;
        }
        if (this.pertemuanPraktikum != other.pertemuanPraktikum && (this.pertemuanPraktikum == null || !this.pertemuanPraktikum.equals(other.pertemuanPraktikum))) {
            return false;
        }
        if (this.nilai != other.nilai && (this.nilai == null || !this.nilai.equals(other.nilai))) {
            return false;
        }
        if (this.statusNilai != other.statusNilai) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 71 * hash + (this.mahasiswa != null ? this.mahasiswa.hashCode() : 0);
        hash = 71 * hash + (this.pertemuanPraktikum != null ? this.pertemuanPraktikum.hashCode() : 0);
        hash = 71 * hash + (this.nilai != null ? this.nilai.hashCode() : 0);
        hash = 71 * hash + (this.statusNilai != null ? this.statusNilai.hashCode() : 0);
        return hash;
    }
    
    
}
