package id.ac.undiksha.siak.entitis;

public class pegawai extends Manusia {
	private String nip;
	private String unit;
	
	public pegawai() {
		super();
		this.setNip("(NIP belum diisi)");
		this.setUnit("(Unit belum diisi)");	
		
	}
	
	public pegawai(String nama, String alamat, boolean jenisKelamin, String nip, String unit) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		this.unit = unit;
	}

	public void printAllInfo() {
		System.out.println("Nama: "+ this.getNama());
		System.out.println("NIM: "+ this.getNip());
		System.out.println("Alamat: "+ this.getAlamat());
		System.out.println("Unit: "+ this.getUnit());
		System.out.println("Jenis Kelamin: " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}