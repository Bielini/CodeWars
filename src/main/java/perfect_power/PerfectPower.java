package perfect_power;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {

        double border = Math.ceil(Math.log10(n) / Math.log10(2));
        for (int k = 2; k <= n/k; k++) {
            if (n%k==0) {
                for (int m = 2; m <= border; m++) {
                    if (Math.pow(k, m) == n) {
                        return new int[]{k, m};
                    }

                }
            }
        }
        return null;
    }
}
