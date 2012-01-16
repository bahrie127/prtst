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
 * ini adalah class PertemuanPraktikum
 */
@Entity
@Table(name = "pertemuan_praktikum")
public class PertemuanPraktikum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "petemuan_praktikum_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "praktikum_", nullable = false)
    private Praktikum praktikum;
    @Column(name = "petemuan_ke", nullable = false)
    private Integer pertemuanKe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPertemuanKe() {
        return pertemuanKe;
    }

    public void setPertemuanKe(Integer pertemuanKe) {
        this.pertemuanKe = pertemuanKe;
    }

    public Praktikum getPraktikum() {
        return praktikum;
    }

    public void setPraktikum(Praktikum praktikum) {
        this.praktikum = praktikum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PertemuanPraktikum other = (PertemuanPraktikum) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.praktikum != other.praktikum && (this.praktikum == null || !this.praktikum.equals(other.praktikum))) {
            return false;
        }
        if (this.pertemuanKe != other.pertemuanKe && (this.pertemuanKe == null || !this.pertemuanKe.equals(other.pertemuanKe))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.praktikum != null ? this.praktikum.hashCode() : 0);
        hash = 89 * hash + (this.pertemuanKe != null ? this.pertemuanKe.hashCode() : 0);
        return hash;
    }
}
