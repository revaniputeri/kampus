package minggu5;

/**
 * Faktorial
 */
public class Faktorial {
    public int nilai;

    int faktorialBF(int n) {
        long startTime = System.nanoTime();
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = n * faktorialBF(n - 1);
            long endTime = System.nanoTime();
            System.out.println("waktu yang diperlukan untuk fBF(" + n + "): " + (endTime - startTime));
            return result;
        }
    }

    public int faktorialDC(int n) {
        long startTime = System.nanoTime();
        if (n == 1) {
            return 1;
        } else {
            long endTime = System.nanoTime();
            int fakto = n * faktorialDC(n - 1);
            System.out.println("waktu yang diperlukan untuk fBF(" + n + "): " + (endTime - startTime));
            return fakto;
        }
    }
}