import java.util.Scanner;

public class sistemRekrutmenKaryawan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int seleksiChoice, nilai1, nilai2, nilai3, totalNilai;
        double avg = 0;
        char statusSehat;
        boolean isMasuk = false;
        while (isMasuk != true) {
            isMasuk = true;
            System.out.print("Masukkan jumlah karyawan: ");
            int jumlahKaryawan = sc.nextInt();
            int i = 0;
            while (i < jumlahKaryawan) {
                System.out.println("=============================");
                System.out.println("|Jenis Tes                   |");
                System.out.println("=============================");
                System.out.println("| 1. Tes Potensi Akademik    |");
                System.out.println("| 2. Tes Bahasa Inggris      |");
                System.out.println("| 3. Tes Nasionalisme        |");
                System.out.println("==============================");
                System.out.println("Masukkan nilai calon ke "+ (i+1)+ ": ");
                System.out.print("Tes Potensi Akademik: ");
                nilai1 = sc.nextInt();
                System.out.print("Tes Bahasa Inggris  : ");
                nilai2 = sc.nextInt();
                System.out.print("Tes Nasionalisme    : ");
                nilai3 = sc.nextInt();
                i++;

                totalNilai = nilai1 + nilai2 + nilai3;
                avg = (double) totalNilai / 3;

                System.out.printf("Rata-rata dari nilai tes Anda adalah %.2f\n", avg);

                if (avg >= 78) {
                    if (nilai1 < 75 || nilai2 < 75 || nilai3 < 75) {
                        System.out.println("Maaf Anda dinyatakan tidak lolos seleksi");
                        System.out.println("Salah satu nilai Anda dibawah 75");
                    } else {
                        System.out.println(
                                "Anda dinyatakan lolos seleksi tes dan akan berlanjut ke Seleksi Kelengkapan Sesuai Berkas");
                        System.out.print("Masukkan IPK Anda: ");
                        double ipk = sc.nextDouble();
                        if (ipk >= 3.25) {
                            System.out.println("Apakah Anda sudah melakukan tes Kesehatan Jasmani dan Rohani?");
                            System.out.println("Ketik 'y' jika sudah dan 't' jika belum");
                            statusSehat = sc.next().charAt(0);
                            if (statusSehat == 'y') {
                                System.out.print("Masukkan no surat: ");
                                String noSurat = sc1.nextLine();
                                System.out.println("Anda dinyatakan Lolos Seleksi Kelengkapan Sesuai Berkas");
                            } else {
                                System.out.println("Anda dinyatakan Tidak Lolos Seleksi Kelengkapan Sesuai Berkas");
                            }
                        } else {
                            System.out.println("Nilai IPK Anda kurang dari nilai minimal");
                        }
                    }
                } else {
                    System.out.println("Maaf Anda dinyatakan tidak lolos seleksi");
                }
            }
        }

    }
}