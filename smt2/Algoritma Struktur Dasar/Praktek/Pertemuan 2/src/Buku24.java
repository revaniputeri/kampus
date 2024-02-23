public class Buku24 {
    String judul, pengarang;
    int halaman, stok, harga, totalHarga, hargaBayar;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok kosong");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku24() {

    }

    public Buku24(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }

    void hitungHargaTotal(int jml) {
        totalHarga = harga * jml;
    }

    double diskon = 0;

    void hitungDiskon() {
        if (totalHarga > 150000) {
            diskon = totalHarga * 0.12;
        } else if (totalHarga > 75_000 && totalHarga < 150_000) {
            diskon = totalHarga * 0.05;
        } else {
            diskon = 0;
        }
    }

    void hitungHargaBayar() {
        hargaBayar = totalHarga - (int) diskon;
    }

    void tampilTransaksi(){
        System.out.println("Total Harga: "+totalHarga);
        System.out.println("Total Diskon: "+(int)diskon);
        System.out.println("Total Bayar: "+hargaBayar);
    }
}
