import java.util.Scanner;
public class Gaji24 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkmasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkmasuk=input.nextInt();
        System.out.println("Masukkan Besaran gaji Anda ");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(jmlTdkmasuk*potGaji);

        System.out.println("Gaji yang Anda terima adalah "+TotGaji);

    }
}