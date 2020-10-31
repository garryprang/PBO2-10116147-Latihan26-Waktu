/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan kalender dan waktu saat ini.
 */

public class PBO210116147Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, d MMMM yyyy, "
                + "hh:mm:ss");

        String kalendar = tanggal.format(calendar.getTime());

        System.out.println("Hari ini adalah hari " + kalendar);
        System.out.println("Developed by Garry Prang");
    }
    
}
