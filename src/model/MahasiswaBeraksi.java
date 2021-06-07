package model;

import java.util.Date;

public class MahasiswaBeraksi {
	public static void main (String [] args) {
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.npm = "19630944";
		mahasiswa.nama = "Giat Adi Hatmojo";
		mahasiswa.tanggallahir = new Date();
		
		System.out.println("Nama \t\t\t : " + mahasiswa.nama);
		System.out.println("NPM \t\t\t : " + mahasiswa.npm);
		System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggallahir);
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.npm = "19816494";
		mahasiswa2.nama = "Hatmojo";
		mahasiswa2.tanggallahir = new Date();
		
		System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
		System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
		System.out.println("Tanggal Lahir \t : " + mahasiswa2.tanggallahir);
	}
		
}
