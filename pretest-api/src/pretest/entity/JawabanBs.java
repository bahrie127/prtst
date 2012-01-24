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

  
    
    
}
