/*
 * =========================  TEMPLATE  =========================
 * Insertion Sort (stable) for int[]
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: use the [lo..hi] overload for partially sorted ranges.
 * ===============================================================
 */
public class InsertionSort {
    private InsertionSort() {}

    public static void insertionSort(int[] a) {
        if (a == null || a.length < 2) return;
        insertionSort(a, 0, a.length - 1);
    }

    /** Inclusive indices [lo..hi]. */
    public static void insertionSort(int[] a, int lo, int hi) {
        if (a == null || hi - lo < 1) return;
        for (int i = lo + 1; i <= hi; i++) {
            int key = a[i], j = i - 1;
            while (j >= lo && a[j] > key) { a[j + 1] = a[j]; j--; }
            a[j + 1] = key;
        }
    }
}
