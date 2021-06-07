package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
	String nama;
	String npm;
	Date tanggallahir;
	
	void tampilkanAtribut() {
		String polaTanggal = "dd-MM-yyyy";
		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat(polaTanggal);
		
		System.out.println("Nama \t\t\t : " + this.nama);
		System.out.println("NPM \t\t\t : " + this.npm);
		System.out.println("Tanggal Lahir \t\t : " + SimpleDateFormat.format(this.tanggallahir));
	}
	void menyapa() {
		System.out.println("Hai nama aku : "+ this.nama);
	}

}
