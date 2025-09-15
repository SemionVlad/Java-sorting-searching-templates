/*
 * =========================  TEMPLATE  =========================
 * Quick Sort 3‑way (Dijkstra) for int[]
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: median-of-three is included; you can switch to random pivot if preferred.
 * ===============================================================
 */
public class QuickSort3Way {
    private QuickSort3Way() {}

    public static void quickSort(int[] a) {
        if (a == null || a.length < 2) return;
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int p = medianOfThree(a, lo, mid, hi);
            swap(a, lo, p);
            int pivot = a[lo];

            int lt = lo, i = lo + 1, gt = hi;
            while (i <= gt) {
                if (a[i] < pivot)      swap(a, lt++, i++);
                else if (a[i] > pivot) swap(a, i, gt--);
                else                   i++;
            }

            if ((lt - lo) < (hi - gt)) {
                sort(a, lo, lt - 1);
                lo = gt + 1;           // tail-eliminate larger side
            } else {
                sort(a, gt + 1, hi);
                hi = lt - 1;
            }
        }
    }

    private static int medianOfThree(int[] a, int i, int j, int k) {
        int ai = a[i], aj = a[j], ak = a[k];
        if (ai < aj) {
            if (aj < ak) return j;
            return (ai < ak) ? k : i;
        } else {
            if (ai < ak) return i;
            return (aj < ak) ? k : j;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
