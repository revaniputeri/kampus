import java.util.Scanner;
public class HargaBayar24 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int harga, jumlah, HalBuku;
        String merkBuku;
        double dis, total, bayar, jmlDis;
        
        System.out.println("Masukkan harga barang yang dibeli : ");
        harga=sc.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli : ");
        jumlah=sc.nextInt();
        merkBuku=sc.nextLine();
        System.out.println("Masukkan merk buku yang dibeli : ");
        merkBuku=sc.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang anda dibeli : ");
        HalBuku=sc.nextInt();
        System.out.println("Masukkan diskon barang : ");
        dis=sc.nextInt();

        total = harga*jumlah;
        jmlDis= total*(dis/100);
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah  "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah  "+bayar);

    }  
}