import java.util.Scanner;

public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        int tahun;
        System.out.print("Masukkan tahun: ");
        tahun = input24.nextInt();
        if ((tahun %4 ) == 0) {
            if ((tahun %100) == 0) {
                if ((tahun %400) == 0) {
                    System.out.println("Tahun Kabisat");      
                }else{
                    System.out.println("Bukan Tahun Kabisat");
                }   
            }else{
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }    
    }
}