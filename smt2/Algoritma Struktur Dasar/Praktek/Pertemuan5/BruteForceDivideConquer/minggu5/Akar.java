package minggu5;
public class Akar {
    int n;

    public Akar(int n) {
        this.n = n;
    }

    public int findSqrtBruteForce() {
        int sqrt = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i <= n) {
                sqrt = i;
            }
        }
        return sqrt;
    }

    public int findSqrtDivideConquer() {
        if (n < 2) {
            return n;
        }
        int low = 1;
        int high = n;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid <= n && (mid + 1) * (mid + 1) > n) {
                return mid;
            } else if (mid * mid > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}