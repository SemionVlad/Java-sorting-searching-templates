/*
 * =========================  TEMPLATE  =========================
 * Radix Sort LSD base‑256 for signed int (handles negatives)
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: if you only need non-negatives, you can use a simpler base-10 variant below.
 * ===============================================================
 */
public class RadixSort {
    private RadixSort() {}

    /** Full 32‑bit signed ints via 4 byte passes; stable per pass. */
    public static void radixSortLSD256(int[] a) {
        if (a == null || a.length < 2) return;
        final int n = a.length, B = 256;
        int[] out = new int[n];
        for (int pass = 0; pass < 4; pass++) {
            int[] count = new int[B];
            int shift = pass * 8;
            for (int v : a) {
                int b = (v >>> shift) & 0xFF;
                if (pass == 3) b ^= 0x80; // rotate sign in MSB pass
                count[b]++;
            }
            for (int i = 1; i < B; i++) count[i] += count[i - 1];
            for (int i = n - 1; i >= 0; i--) {
                int v = a[i];
                int b = (v >>> shift) & 0xFF;
                if (pass == 3) b ^= 0x80;
                out[--count[b]] = v;
            }
            System.arraycopy(out, 0, a, 0, n);
        }
    }

    /** Simple demo: base-10, non-negative only. */
    public static void radixSortLSD10NonNegative(int[] a) {
        if (a == null || a.length < 2) return;
        int n = a.length, max = 0;
        for (int v : a) {
            if (v < 0) throw new IllegalArgumentException("non-negative only");
            if (v > max) max = v;
        }
        int[] out = new int[n];
        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] count = new int[10];
            for (int v : a) count[(v / exp) % 10]++;
            for (int i = 1; i < 10; i++) count[i] += count[i - 1];
            for (int i = n - 1; i >= 0; i--) {
                int v = a[i], d = (v / exp) % 10;
                out[--count[d]] = v;
            }
            System.arraycopy(out, 0, a, 0, n);
        }
    }
}
