import java.util.Scanner;

public class fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stokBunga = {
                { 10, 5, 15, 7 }, // RoyalGarden 1:
                { 6, 11, 9, 12 }, // RoyalGarden 2:
                { 2, 10, 10, 5 }, // RoyalGarden 3:
                { 5, 7, 12, 9 } // RoyalGarden 4:
        };
        int[] penguranganStok = {-1, -2, 0, -5};
        int[] hargaBunga = { 75000, 50000, 60000, 10000 }; // Aglonema, Keladi, Alocasia, Mawar

        hitungPendapatan(stokBunga, hargaBunga);
        tampilkanStokBungaRoyalGarden4(stokBunga, penguranganStok);
    }

    public static void hitungPendapatan(int[][] stokBunga, int[] hargaBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < stokBunga.length; i++) {
            String cabang = "RoyalGarden " + (i + 1);
            int pendapatanCabang = 0;

            // Iterasi setiap jenis bunga
            for (int j = 0; j < stokBunga[i].length; j++) {
                int jumlahStok = stokBunga[i][j];
                int hargaSatuan = hargaBunga[j];

                pendapatanCabang += jumlahStok * hargaSatuan;
            }

            System.out.println("Pendapatan cabang " + cabang + ": Rp " + pendapatanCabang);
            totalPendapatan += pendapatanCabang;
        }
        System.out.println("Total pendapatan semua cabang: Rp " + totalPendapatan);
    }

    public static void tampilkanStokBungaRoyalGarden4(int[][] stokBunga, int[] penguranganStok) {
        System.out.println("Jumlah stock setiap jenis bunga pada cabang RoyalGarden 4 setelah pengurangan stock:");
        String[] jenisBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        for (int i = 0; i < jenisBunga.length; i++) {
            int stokSetelahPengurangan = stokBunga[3][i] + penguranganStok[i];
            System.out.println(jenisBunga[i] + ": " + stokSetelahPengurangan);
        }
    }
}
