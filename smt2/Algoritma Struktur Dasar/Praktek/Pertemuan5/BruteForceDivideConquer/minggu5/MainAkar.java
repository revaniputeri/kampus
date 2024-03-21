package minggu5;
import java.util.*;
public class MainAkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan akar: ");
        int n = sc.nextInt();

        // Create an instance of the Akar class (assuming it's defined below)
        Akar sqrt = new Akar(n);
        int sqrtBruteForce = sqrt.findSqrtBruteForce();
        int sqrtDivideConquer = sqrt.findSqrtDivideConquer();
        System.out.println("Akar dari " + n + " dengan Brute Force: " + sqrtBruteForce);
        System.out.println("Akar dari " + n + " dengan Divide Conquer: " + sqrtDivideConquer);
    }
}
