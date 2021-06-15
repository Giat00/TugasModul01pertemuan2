package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String nama;
    String npm;
    Date tanggalLahir;
    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void tampilkanAtribut() {
        System.out.println("Nama \t\t\t :" + this.nama);
        System.out.println("NPM \t\t\t :" + this.npm);
        System.out.println("Tanggal Lahir \t\t :" + SDF.format(this.tanggalLahir));
    }

    void menyapa() {
        System.out.println("Hai nama aku \t\t : " + this.nama);
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

        if(hariIni.get(Calendar.MONTH) < tanggalLahir.get((Calendar.MONTH))) {
            selisihTahun--;
        } else {
            if(hariIni.get(Calendar.MONTH) == tanggalLahir.get(Calendar.MONTH) && hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) {
                selisihTahun--;
            }
        }
        return selisihTahun;
    }

    public Mahasiswa() {
    }

    public Mahasiswa(String npm, String nama, String tanggalLahir) {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        this.nama = nama;
        this.npm = npm;
        try {
            this.tanggalLahir = SDF.parse((tanggalLahir));
        } catch (ParseException e) {
            System.err.println("Kesalahan pada tanggal lahir");
        }
    }

}
