package ClinicSystem;

import java.util.*;

public class clinic {

    private final Scanner input;
    private static final int MAX_PASIEN = 100;
    private Pasien[] pasienList = new Pasien[MAX_PASIEN];
    private static UserCredentials[] credentials;
    private int jumlahPasien = 0;
    private boolean lanjutInput = true;
    private static int idOtomatis = 1;

    public clinic(Scanner input) {
        this.input = input;
        credentials = new UserCredentials[] { // Initialize credentials array (optional)
                new UserCredentials("admin", "password")
        };
    }

    public static class UserCredentials {
        private String username;
        private String password;

        public UserCredentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    public static class Pasien {
        private String noKartu;
        private String nama;
        private String noKtp;
        private String alamat;
        private String noTelp;

        public Pasien(String noKartu, String nama, String noKtp, String alamat, String noTelp) {
            this.noKartu = noKartu;
            this.nama = nama;
            this.noKtp = noKtp;
            this.alamat = alamat;
            this.noTelp = noTelp;
        }

        public String getNoKartu() {
            return noKartu;
        }

        public String getNama() {
            return nama;
        }

        public String getNoKtp() {
            return noKtp;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getNoTelp() {
            return noTelp;
        }
    }

    boolean adminLogin() {
        System.out.println("==========================================================================");
        System.out.print("Masukkan username admin: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password admin: ");
        String inputPassword = input.nextLine();
        System.out.println("==========================================================================");

        if (credentials == null || credentials.length == 0) { // Handle empty credentials array
            return false;
        }

        for (UserCredentials credential : credentials) {
            if (credential.getUsername().equals(inputUsername) && credential.getPassword().equals(inputPassword)) {
                return true;
            }
        }

        return false;
    }

    void registrasiPasienBaru() {
        System.out.println("");
        System.out.println("");
        System.out.println("KLINIK X - REGISTRASI PASIEN");
        while (lanjutInput) {
            if (jumlahPasien >= MAX_PASIEN) {
                System.out.println("Jumlah pasien sudah mencapai batas maksimal.");
                return;
            }

            String noKartu = generateKartuNumber();
            System.out.println("==========================================================================");
            System.out.println("No Kartu: " + noKartu);

            Pasien newPasien = createPasienObject(noKartu);

            System.out.println("--------------------------------------------------");
            System.out.println("DATA BERHASIL DISIMPAN!");
            printPasienDetails(newPasien);
            System.out.println("==========================================================================");
            idOtomatis++;

            lanjutInput = lanjutInputPasien();
        }
    }

    boolean lanjutInputPasien() {
        System.out.println("Apakah ingin memasukkan data pasien lagi? (Y/T)");
        String pilihan = input.nextLine().toUpperCase();
        return pilihan.equals("Y");
    }

    Pasien createPasienObject(String noKartu) {
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("No KTP: ");
        String noKtp = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("No. Telp: ");
        String noTelp = input.nextLine();

        return new Pasien(noKartu, nama, noKtp, alamat, noTelp);
    }

    String generateKartuNumber() {
        return "P" + String.format("%04d", idOtomatis);
    }

    void printPasienDetails(Pasien pasien) {
        System.out.println("No Kartu: " + pasien.getNoKartu());
        System.out.println("Nama: " + pasien.getNama());
        System.out.println("No KTP: " + pasien.getNoKtp());
        System.out.println("Alamat: " + pasien.getAlamat());
        System.out.println("No. Telp: " + pasien.getNoTelp());
    }
}
