/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest.client.util;

import pretest.entity.Mahasiswa;
import pretest.entity.PertemuanPraktikum;
import pretest.entity.Setting;

/**
 *
 * @author : Saiful Bahri
 * Blog    : http://bahrie27.wordpress.com/
 * Twitter : @bahrie127
 */
public interface PilihSoalListener {
    public void pilihSoal(String pilih,PertemuanPraktikum pp,Mahasiswa mhs,Setting setting );
}
