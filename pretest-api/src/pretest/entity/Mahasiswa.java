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
    @Column(name = "nim", nullable = false, length = 15)
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
}
