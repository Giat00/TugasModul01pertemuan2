package model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
	public static void main (String [] args) throws ParseException {
		
		String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630944";
        mahasiswa.nama = "Giat Adi Hatmojo";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-08-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku \t\t\t : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19630944", "Hatmojo", "08-09-2001");
        mahasiswa2.tampilkanAtribut();
	}
		
}
