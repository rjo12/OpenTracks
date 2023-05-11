package de.dennisguse.opentracks.sensors;

public class UintUtils {

    public static final int UINT16_MAX = 0xFFFF;
    public static final long UINT32_MAX = 0xFFFFFFFFL;

    private UintUtils() {
    }

    /**
     * Computes a - b for UINT with overflow (b < a).
     *
     * @return diff
     */
    public static long diff(long a, long b, final long UINT_MAX) {
        
        a %= (UINT_MAX + 1);
        if (a < 0) {
            a += (UINT_MAX + 1);
        }
        b %= (UINT_MAX + 1);
        if (b < 0){
            b += (UINT_MAX + 1);
        }

        if (a >= b) {
            return a - b;
        }

        return (UINT_MAX + 1 - b) + a;
    }
}
