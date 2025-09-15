    /*
     * =========================  TEMPLATE  =========================
     * Bubble Sort (stable, adaptive) for int[]
     * Copy-paste into your project and tweak as needed.
     * - No package
     * - Small, static API
     * - Safe to rename class/methods
     * - TODO: keep '>' (not '>=') in comparison to preserve stability.
- TODO: rename the class or method as needed.
     * ===============================================================
     */
public class BubbleSort {
    private BubbleSort() {}

    /** Sorts a in non-decreasing order. */
    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) return;
        int last = a.length - 1;
        while (last > 0) {
            int newLast = 0;
            for (int j = 0; j < last; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                    newLast = j;
                }
            }
            last = newLast;
        }
    }
}
