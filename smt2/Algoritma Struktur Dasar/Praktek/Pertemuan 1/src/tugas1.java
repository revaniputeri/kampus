import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kota = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };

        System.out.print("Kode Plat : ");
        char scKode = sc.next().charAt(0);

        String kodePlat = String.valueOf(scKode).toUpperCase();
        int indexKode = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kodePlat.equalsIgnoreCase(String.valueOf(kode[i]))) {
                indexKode = i;
                break;
            }
        }

        for (int i = 0; i < kota.length;) {
            System.out.print("Kota : ");
            for (int j = 0; j < kota[i].length; j++) {
                System.out.print(kota[indexKode][j]);
            }
            break;
        }
        sc.close();
    }
}