package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entitis.mahasiswa;
import id.ac.undiksha.siak.entitis.Dosen;
import id.ac.undiksha.siak.entitis.pegawai;

public class ilkom {

	public static void ilkom(String[] args) {
		
		mahasiswa mhs1 = new mahasiswa(
			"ogan", 
			"Buleleng", 
			true, 
			"015", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan"
		);
		
		Dosen dosen1 = new Dosen(
			"pak Andi", 
			"Singaraja", 
			true, 
			"002", 
			"Sistem Informasi", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan", 
			"Wakil Dekan I"
		);
		
		pegawai pgw1 = new pegawai(
			"Roni", 
			"Singaraja", 
			false, 
			"003", 
			"Tata usaha"
		);
		
		mahasiswa mhs2 = new mahasiswa(
			"Nanni", 
			"Singaraja", 
			false, 
			"008", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Fakultas Teknik dan Kejuruan"
		);
		
		mhs1.printAllInfo();
		System.out.println();
		dosen1.printAllInfo();
		System.out.println();
		pgw1.printAllInfo();
		System.out.println();
		mhs2.printAllInfo();
	}

}