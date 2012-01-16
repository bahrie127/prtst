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
 * ini adalah class Praktikum
 */
@Entity
@Table(name = "praktikum")
public class Praktikum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "praktikum_id")
    private Long id;
    @Column(name = "nama", length = 45, nullable = false)
    private String nama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Praktikum other = (Praktikum) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nama == null) ? (other.nama != null) : !this.nama.equals(other.nama)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.nama != null ? this.nama.hashCode() : 0);
        return hash;
    }
}
