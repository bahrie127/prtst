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
@Table(name = "jawaban_bs")
public class JawabanBs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "jawaban_bs_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mahasiswa_", nullable = false)
    private Mahasiswa mahasiswa;
    @ManyToOne
    @JoinColumn(name = "soal_bs_", nullable = false)
    private SoalBs soalBs;
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

    public SoalBs getSoalBs() {
        return soalBs;
    }

    public void setSoalBs(SoalBs soalBs) {
        this.soalBs = soalBs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JawabanBs other = (JawabanBs) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.mahasiswa != other.mahasiswa && (this.mahasiswa == null || !this.mahasiswa.equals(other.mahasiswa))) {
            return false;
        }
        if (this.soalBs != other.soalBs && (this.soalBs == null || !this.soalBs.equals(other.soalBs))) {
            return false;
        }
        if (this.jawab != other.jawab) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 13 * hash + (this.mahasiswa != null ? this.mahasiswa.hashCode() : 0);
        hash = 13 * hash + (this.soalBs != null ? this.soalBs.hashCode() : 0);
        hash = 13 * hash + (this.jawab != null ? this.jawab.hashCode() : 0);
        return hash;
    }
    
    
}
