package pertemuan8;

public class matakuliah {
	
	private String kode;
	private String nama;
	private int sks;
	
	public matakuliah (String kode, String nama, int sks) {
		super ();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
	} 
	
	public String getkode () {
		return kode;
	}
	
	public String getnama () {
		return nama;
	}
	
	public int sks () {
		return sks;
	}

}
