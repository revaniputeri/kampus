package ClinicSystem;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clinic klinik = new clinic(input);

        if (klinik.adminLogin()) {
            System.out.println("Login berhasil!");
            klinik.registrasiPasienBaru();
        } else {
            System.out.println("Login gagal.");
        }
    }
}
