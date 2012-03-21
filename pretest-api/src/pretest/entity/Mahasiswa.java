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
 * ini adalah class Mahasiswa
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mahasiswa_id")
    private Long id;
    @Column(name = "nim", nullable = false, length = 15,unique=true)
    private String nim;
    @Column(name = "nama", nullable = false, length = 100)
    private String nama;
    @Column(name = "password", nullable = false, length = 50)
    private String password;

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

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nim == null) ? (other.nim != null) : !this.nim.equals(other.nim)) {
            return false;
        }
        if ((this.nama == null) ? (other.nama != null) : !this.nama.equals(other.nama)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 53 * hash + (this.nim != null ? this.nim.hashCode() : 0);
        hash = 53 * hash + (this.nama != null ? this.nama.hashCode() : 0);
        hash = 53 * hash + (this.password != null ? this.password.hashCode() : 0);
        return hash;
    }
    
    
}
