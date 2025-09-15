/*
 * =========================  TEMPLATE  =========================
 * Merge Sort (top-down, stable) for int[]
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: requires an auxiliary array; stable merge.
 * ===============================================================
 */
public class MergeSort {
    private MergeSort() {}

    public static void mergeSort(int[] a) {
        if (a == null || a.length < 2) return;
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        if (a[mid] <= a[mid + 1]) return; // early-exit
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            if (a[i] <= a[j]) aux[k++] = a[i++]; // stable
            else              aux[k++] = a[j++];
        }
        while (i <= mid) aux[k++] = a[i++];
        while (j <= hi)  aux[k++] = a[j++];
        for (k = lo; k <= hi; k++) a[k] = aux[k];
    }
}
