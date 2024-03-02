import java.util.Scanner;

public class DataMahasiswa {

    public static final int JUMLAH_MAHASISWA = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mahasiswa = new Mahasiswa[JUMLAH_MAHASISWA];
        
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("");

            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        double totalIpk = 0;
        for (Mahasiswa mhs : mahasiswa) {
            totalIpk += mhs.getIpk();
        }

        double rataRataIpk = totalIpk / JUMLAH_MAHASISWA;

        // Pencetakan data menggunakan foreach
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println("\nData Mahasiswa");
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jenis kelamin: " + mhs.getJenisKelamin());
            System.out.println("Nilai IPK: " + mhs.getIpk());
        }

        System.out.println("\nRata-rata IPK: " + String.format("%.2f", rataRataIpk));
    }
}
