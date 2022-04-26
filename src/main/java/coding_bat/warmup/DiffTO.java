package coding_bat.warmup;

public class DiffTO {

    public static int diff21(int n) {

        if (n > 21) {
            return (21 - n) * -2;
        }
        return 21 - n;

    }
}
