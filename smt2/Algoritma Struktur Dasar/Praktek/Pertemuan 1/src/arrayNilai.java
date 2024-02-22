import java.util.Scanner;

public class arrayNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[] = { "PAMB", "CTPS", "BING", "BIND", "Agama", "MATDAS", "KTI", "DASPRO", "PDASPRO" },
                indexHuruf[] = { "A", "B+", "B", "C+", "C", "D", "E" },
                hurufAkhir = "";
        double sks[] = { 2, 2, 2, 2, 2, 2, 2, 2, 3 },
                batasAtas[] = { 100, 80, 73, 65, 60, 50, 39 },
                batasBawah[] = { 80, 73, 65, 60, 50, 39, 0 },
                bobotNilai[] = { 4, 3.5, 3, 2.5, 2, 1.5, 1 },
                nilaiAngka[] = new double[matkul.length],
                bobotNilaiAkhir = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka unutk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < matkul.length; i++) {
            for (int j = 0; j < indexHuruf.length; j++) {
                if (nilaiAngka[i] >= batasBawah[j] && nilaiAngka[i] <= batasAtas[j]) {
                    totalNilai += bobotNilai[j] * sks[i];
                    totalSKS += sks[i];
                    break;
                }
            }
        }
        double ipSemester = totalNilai / totalSKS;

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf(" %-20s %-15s  %-15s  %-15s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf",
                "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid!");
            } else {
                // penentuan nilai huruf
                for (int j = 0; j < indexHuruf.length; j++) {
                    if (nilaiAngka[i] >= batasBawah[j] && nilaiAngka[i] <= batasAtas[j]) {
                        hurufAkhir = indexHuruf[j];
                        bobotNilaiAkhir = bobotNilai[j];
                        break;
                    }
                }
                System.out.printf(" %-20s %-15s  %-15s  %-15s \n", matkul[i], nilaiAngka[i], hurufAkhir,
                        bobotNilaiAkhir);
            }
        }

        // Output IP Semester
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}
