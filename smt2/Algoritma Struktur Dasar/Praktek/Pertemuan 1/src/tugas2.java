import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pilih Rumus");
        System.out.println("1. Kecepatan\n2. Jarak\n3. Waktu");
        System.out.print("Pilih : ");
        int menu = sc.nextInt();

        float jarak = 0, waktu = 0, kecepatan = 0;
        switch (menu) {
            case 1:
                System.out.print("Masukkan Jarak : ");
                jarak = sc.nextFloat();
                System.out.print("Masukkan Waktu : ");
                waktu = sc.nextFloat();
                Kecepatan(jarak, waktu);
                break;
            case 2:
                System.out.print("Masukkan Kecepatan : ");
                kecepatan = sc.nextFloat();
                System.out.print("Masukkan Waktu : ");
                waktu = sc.nextFloat();
                Jarak(kecepatan, waktu);
                break;
            case 3:
                System.out.print("Masukkan Jarak : ");
                jarak = sc.nextFloat();
                System.out.print("Masukkan Kecepatan : ");
                kecepatan = sc.nextFloat();
                Waktu(jarak, kecepatan);
                break;

            default:
                System.out.println("Input Tidak Valid !");
                break;
        }
    }

    static void Kecepatan(float j, float w) {
        System.out.println("Kecepatan : " + j / w);
    }

    static void Jarak(float k, float w) {
        System.out.println("Jarak : " + k * w);
    }

    static void Waktu(float j, float k) {
        System.out.println("Waktu : " + j / k);

    }
}