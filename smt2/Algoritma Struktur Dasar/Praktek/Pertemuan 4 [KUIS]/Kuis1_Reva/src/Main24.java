import java.util.Scanner;

public class Main24 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Elektronik24[] el24 = inputDataArray();

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilProduk(el24);
                    break;
                case 2:
                    lihatSisaBarang(el24);
                    break;
                case 3:
                    cariProdukTerlaris(el24);
                    break;
                case 4:
                    daftarProduk(el24);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tampilkanMenu() {
        System.out.println("\n**Menu Program Elektronik24:**");
        System.out.println("1. Tampilkan Produk");
        System.out.println("2. Lihat Sisa Barang");
        System.out.println("3. Cari Produk Terlaris");
        System.out.println("4. Daftar Produk");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void tampilProduk(Elektronik24[] el24) {
        for (Elektronik24 produk : el24) {
            produk.tampil();
            System.out.println("");
        }
    }

    private static void lihatSisaBarang(Elektronik24[] el24) {
        int totalStok = 0;
        for (Elektronik24 produk : el24) {
            totalStok += produk.getStok();
        }
        System.out.println("Total Stok: " + totalStok);
    }

    private static void cariProdukTerlaris(Elektronik24[] el24) {
        Elektronik24 terlaris = el24[0];
        for (int i = 1; i < el24.length; i++) {
            if (el24[i].getTerjual() > terlaris.getTerjual()) {
                terlaris = el24[i];
            }
        }
        System.out.println("Produk Terlaris: " + terlaris.getNamaProduk() + " (" + terlaris.getMerk() + ")");
    }

    private static void daftarProduk(Elektronik24[] el24) {
        for (Elektronik24 produk : el24) {
            produk.daftarProduk();
            System.out.println("");
        }
    }

    private static Elektronik24[] inputDataArray() {
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = sc.nextInt();

        Elektronik24[] el24 = new Elektronik24[jumlahProduk];

        for (int i = 0; i < el24.length; i++) {
            System.out.println("\n**Produk " + (i + 1) + "**");
            System.out.print("Nama Produk: ");
            String namaProduk = scanner.nextLine();
            System.out.print("Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = sc.nextInt();
            System.out.print("Terjual: ");
            int terjual = sc.nextInt();

            el24[i] = new Elektronik24(namaProduk, merk, stok, terjual);
        }

        return el24;
    }
}
