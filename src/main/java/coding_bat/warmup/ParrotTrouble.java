package coding_bat.warmup;

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            if (hour < 7 || hour > 20) {
                return true;
            }
        }
        return false;
    }
}
