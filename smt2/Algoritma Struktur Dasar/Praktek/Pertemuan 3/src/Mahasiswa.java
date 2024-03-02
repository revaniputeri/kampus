public class Mahasiswa {

    public String nama;
    public String nim;
    public String jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }
}
