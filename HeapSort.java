/*
 * =========================  TEMPLATE  =========================
 * Heap Sort (max-heap, in-place) for int[]
 * Copy-paste into your project and tweak as needed.
 * - No package
 * - Small, static API
 * - Safe to rename class/methods
 * - TODO: not stable. Keep when O(1) extra space matters.
 * ===============================================================
 */
public class HeapSort {
    private HeapSort() {}

    public static void heapSort(int[] a) {
        if (a == null || a.length < 2) return;
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) siftDown(a, i, n);
        for (int end = n - 1; end > 0; end--) {
            swap(a, 0, end);
            siftDown(a, 0, end);
        }
    }

    private static void siftDown(int[] a, int i, int n) {
        while (true) {
            int left = 2 * i + 1;
            if (left >= n) break;
            int largest = left, right = left + 1;
            if (right < n && a[right] > a[left]) largest = right;
            if (a[i] >= a[largest]) break;
            swap(a, i, largest);
            i = largest;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
