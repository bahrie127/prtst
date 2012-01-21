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
import javax.persistence.Table;

/**
 *
 * ini adalah class Setting
 */
@Entity
@Table(name="setting")
public class Setting implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name="batas_lulus",nullable=false)
    private Double bataLulus;
    
    @Column(name="jam",nullable=false)
    private int jam;
    
    @Column(name="menit",nullable=false)
    private int menit;

    public Double getBataLulus() {
        return bataLulus;
    }

    public void setBataLulus(Double bataLulus) {
        this.bataLulus = bataLulus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Setting other = (Setting) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.bataLulus != other.bataLulus && (this.bataLulus == null || !this.bataLulus.equals(other.bataLulus))) {
            return false;
        }
        if (this.jam != other.jam) {
            return false;
        }
        if (this.menit != other.menit) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 53 * hash + (this.bataLulus != null ? this.bataLulus.hashCode() : 0);
        hash = 53 * hash + this.jam;
        hash = 53 * hash + this.menit;
        return hash;
    }
    
    
    
}
