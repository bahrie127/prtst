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
}
