package minggu5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPerusahaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBulan = 0; // Initialize to avoid uninitialized variable error

        // Input nama perusahaan
        System.out.print("Masukkan nama perusahaan: ");
        String namaPerusahaan = scanner.next();

        boolean validInput = false;
        while (!validInput) {
            try {
                // Input jumlah bulan with loop for validation
                System.out.print("Jumlah bulan: ");
                jumlahBulan = scanner.nextInt();
                validInput = true; // Input valid if no exception occurs
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka bilangan bulat (integer).");
                scanner.nextLine(); // Clear the scanner buffer after invalid input
            }
        }

        // Buat objek Perusahaan
        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, jumlahBulan);

        // Input keuntungan bulanan
        for (int i = 0; i < jumlahBulan; i++) {
            System.out.print("Keuntungan bulan " + (i + 1) + ": ");
            double keuntungan = scanner.nextDouble();
            perusahaan.setKeuntunganBulanan(i, keuntungan);
        }

        double totalKeuntungan = perusahaan.getTotalKeuntungan();

        // Format total keuntungan dengan String.format()
        String totalKeuntunganFormatted = String.format("Rp. %,2f", totalKeuntungan);
        // Tampilkan hasil
        System.out.println("========================");
        System.out.println("Perusahaan: " + perusahaan.getNama());
        System.out.println("Total keuntungan: " + totalKeuntunganFormatted);
    }
}
