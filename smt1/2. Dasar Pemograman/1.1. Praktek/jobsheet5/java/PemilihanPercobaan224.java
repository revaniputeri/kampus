import java.util.Scanner;

public class PemilihanPercobaan224 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);

        System.out.print("Nilai uas     : ");
        float uas = input24.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input24.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input24.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input24.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        String nilai;
        if (total > 80 && total  <= 100){
             nilai = "A";
        }else if (total > 73 && total <= 80){
             nilai = "B+";
        }else if (total > 65 && total <= 73){
             nilai = "B";
        }else if (total > 60 && total <= 65){
             nilai = "C+";
        }else if (total > 50 && total <= 60){
             nilai = "C";
        }else if (total > 39 && total <= 50){
             nilai = "D";
        }else {
             nilai = "E";
        }

        System.out.println("Nilai Akhir = " +total+ ", Nilai Huruf = " +nilai+ " sehingga " +message);


    }
}