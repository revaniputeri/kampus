public class Elektronik24 {

    private String namaProduk;
    private String merk;
    private int stok;
    private int terjual;

    public Elektronik24(String namaProduk, String merk, int stok, int terjual) {
        this.namaProduk = namaProduk;
        this.merk = merk;
        this.stok = stok;
        this.terjual = terjual;
    }

    public void tampil() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Merk: " + this.merk);
        System.out.println("Stok: " + this.stok);
        System.out.println("Terjual: " + this.terjual);
    }

    public void daftarProduk() {
        System.out.println("-" + this.namaProduk + " (" + this.merk + ")");
    }

    public int getStok() {
        return this.stok - this.terjual;
    }

    public int getTerjual() {
        return this.terjual;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public String getMerk() {
        return this.merk;
    }
}
