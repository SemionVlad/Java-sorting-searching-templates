/*
 * =========================  TEMPLATE  =========================
 * Counting Sort (stable) for int[] in [min..max]
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: prefer this when (max-min) is small relative to n.
 * ===============================================================
 */
public class CountingSort {
    private CountingSort() {}

    public static void countingSort(int[] a, int minVal, int maxVal) {
        if (a == null || a.length < 2) return;
        if (minVal > maxVal) throw new IllegalArgumentException("minVal > maxVal");
        int n = a.length, k = maxVal - minVal + 1;
        int[] count = new int[k];
        for (int v : a) count[v - minVal]++;
        for (int i = 1; i < k; i++) count[i] += count[i - 1];
        int[] out = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int v = a[i];
            out[--count[v - minVal]] = v; // stable placement
        }
        System.arraycopy(out, 0, a, 0, n);
    }

    public static void countingSort(int[] a) {
        if (a == null || a.length < 2) return;
        int min = a[0], max = a[0];
        for (int v : a) { if (v < min) min = v; if (v > max) max = v; }
        countingSort(a, min, max);
    }
}
