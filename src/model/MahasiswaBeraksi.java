package model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
	public static void main (String [] args) throws ParseException {
		
		String polaTanggal = "dd-MM-yyyy";
		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat(polaTanggal);
		
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.npm = "19630944";
		mahasiswa.nama = "Giat Adi Hatmojo";
		mahasiswa.tanggallahir = SimpleDateFormat.parse("09-08-2001" );
		 
		System.out.println("Nama \t\t\t : " + mahasiswa.nama);
		System.out.println("NPM \t\t\t : " + mahasiswa.npm);
		System.out.println("Tanggal Lahir \t\t : " + mahasiswa.tanggallahir);
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.npm = "19816494";
		mahasiswa2.nama = "Hatmojo";
		mahasiswa2.tanggallahir = SimpleDateFormat.parse("09-08-2003" );
		
		System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
		System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
		System.out.println("Tanggal Lahir \t\t : " + mahasiswa2.tanggallahir);
	}
		
}
