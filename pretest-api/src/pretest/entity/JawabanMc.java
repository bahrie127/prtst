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
import pretest.entity.enuum.Jawab;

/**
 *
 * ini adalah class JawabanBs
 */
@Entity
@Table(name = "jawaban_mc")
public class JawabanMc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "jawaban_mc_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mahasiswa_", nullable = false)
    private Mahasiswa mahasiswa;
    @ManyToOne
    @JoinColumn(name = "soal_mc_", nullable = false)
    private SoalMc soalMc;
    @Column(name = "jawab", nullable = false)
    private Jawab jawab;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jawab getJawab() {
        return jawab;
    }

    public void setJawab(Jawab jawab) {
        this.jawab = jawab;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public SoalMc getSoalMc() {
        return soalMc;
    }

    public void setSoalMc(SoalMc soalMc) {
        this.soalMc = soalMc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JawabanMc other = (JawabanMc) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.mahasiswa != other.mahasiswa && (this.mahasiswa == null || !this.mahasiswa.equals(other.mahasiswa))) {
            return false;
        }
        if (this.soalMc != other.soalMc && (this.soalMc == null || !this.soalMc.equals(other.soalMc))) {
            return false;
        }
        if (this.jawab != other.jawab) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 41 * hash + (this.mahasiswa != null ? this.mahasiswa.hashCode() : 0);
        hash = 41 * hash + (this.soalMc != null ? this.soalMc.hashCode() : 0);
        hash = 41 * hash + (this.jawab != null ? this.jawab.hashCode() : 0);
        return hash;
    }
    
    
}
