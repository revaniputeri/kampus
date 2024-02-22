import java.util.Scanner;

public class pemilihanNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String indexHuruf[] = { "A", "B+", "B", "C+", "C", "D", "E" };
        int batasAtas[] = { 100, 80, 73, 65, 60, 50, 39 };
        int batasBawah[] = { 80, 73, 65, 60, 50, 39, 0 };
        String kualifikasi[] = { "Sangat Baik", "Lebih dari Baik", "Baik", "Lebih dari Cukup", "Cukup", "Kurang",
                "Gagal" };

        System.out.println("Program Menghitung Nilai Akhir");

        // input nilai
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS  : ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS  : ");
        double nilaiUas = sc.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");

        // validasi nilai 0-100
        if (nilaiKuis < 0 || nilaiKuis > 100 || nilaiTugas < 0 || nilaiTugas > 100 || nilaiUas < 0 || nilaiUas > 100
                || nilaiUts < 0 || nilaiUts > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            // perhitungan nilai
            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);

            // penentuan nilai huruf
            int hurufAkhir = 0;
            for (int i = 0; i < indexHuruf.length; i++) {
                if (nilaiAkhir >= batasBawah[i] && nilaiAkhir <= batasAtas[i]) {
                    hurufAkhir = i;
                    break;
                }
            }
            // validasi lulus/tidak lulus
            String keterangan = (hurufAkhir >= 0 && hurufAkhir <= 5) ? "LULUS" : "TIDAK LULUS";

            // output hasil nilai akhir
            System.out.println("Nilai Akhir         : " + nilaiAkhir);
            System.out.println("Nilai Huruf         : " + indexHuruf[hurufAkhir]);
            System.out.println("Keterangan          : " + keterangan);
            System.out.println("===============================");
        }
    }
}