import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int lengthArray = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[lengthArray];
        int panjang, lebar;
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);

        }
        System.out.println("");
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            arrayOfPersegiPanjang[i].cetakinfo();
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    }
}
