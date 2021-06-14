package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
		Mahasiswa Mahasiswa2 = new Mahasiswa();
	}
	
	int hitungUsia(){
		Calendar tanggallahir = Calendar.getInstance();
		tanggallahir.setTime(this.tanggallahir);
		Calendar hariini = Calendar.getInstance();
		
		int selisihtahun = hariini.get(Calendar.YEAR) - tanggallahir.get(Calendar.YEAR);
		
		if(hariini.get(Calendar.MONTH) < tanggallahir.get(Calendar.MONTH)) {
			selisihtahun--;
		}else {
			if(hariini.get(Calendar.MONTH) == tanggallahir.get(Calendar.MONTH)
					&& hariini.get(Calendar.DAY_OF_MONTH) < tanggallahir.get(Calendar.DAY_OF_MONTH)) {
				selisihtahun--;
			}
		}
		return selisihtahun;
	}

}
